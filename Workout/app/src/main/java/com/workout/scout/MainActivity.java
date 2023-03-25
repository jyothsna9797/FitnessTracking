package com.workout.scout;

import android.Manifest;
import android.app.*;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.*;
import android.net.Uri;

import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;


import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.UploadTask;


public class MainActivity extends Activity {

	public final int REQ_CD_PROFILEPHOTO = 101;

	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	private FirebaseStorage _firebase_storage = FirebaseStorage.getInstance();

	private String fontName = "";
	private String typeace = "";
	private HashMap<String, Object> map = new HashMap<>();
	private String AvatarPath = "";
	private String AvatarName = "";
	private String AvatarUrl = "";
	private String PATTERN = "";
	private HashMap<String, Object> Map_users = new HashMap<>();
	private String key = "";
	private boolean ImagePicked = false;
	private String string = "";
	private String Image_path = "";
	private String Image_Url = "";

	private ArrayList<String> string_map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> Path = new ArrayList<>();

	private LinearLayout linear1;
	private LinearLayout loginpage;
	private LinearLayout singuppage;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private ImageView imageview1;
	private EditText loginemail;
	private ImageView imageview2;
	private EditText loginpass;
	private Button loginbutton;
	private TextView textview1;
	private TextView textview2;
	private ImageView profile_image;
	private LinearLayout linear9;
	private LinearLayout linear14;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private Button singupbutton;
	private LinearLayout linear12;
	private ImageView imageview4;
	private EditText singupname;
	private ImageView imageview8;
	private EditText age;
	private ImageView imageview5;
	private EditText singupemail;
	private ImageView imageview6;
	private EditText singuppasswo;
	private TextView textview5;
	private TextView textview6;

	private FirebaseAuth auth;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;

	private Intent next = new Intent();
	private TimerTask timer;
	private TimerTask t;
	private DatabaseReference Users = _firebase.getReference("Users");
	private ChildEventListener _Users_child_listener;
	private Intent profilePhoto = new Intent(Intent.ACTION_GET_CONTENT);
	private StorageReference profilePhoto_FS = _firebase_storage.getReference("profilePhoto_FS");
	private OnCompleteListener<Uri> _profilePhoto_FS_upload_success_listener;
	private OnSuccessListener<FileDownloadTask.TaskSnapshot> _profilePhoto_FS_download_success_listener;
	private OnSuccessListener _profilePhoto_FS_delete_success_listener;
	private OnProgressListener _profilePhoto_FS_upload_progress_listener;
	private OnProgressListener _profilePhoto_FS_download_progress_listener;
	private OnFailureListener _profilePhoto_FS_failure_listener;

	private Intent i = new Intent();



	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);

		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
				|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}

	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}

	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		loginpage = findViewById(R.id.loginpage);
		singuppage = findViewById(R.id.singuppage);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		imageview1 = findViewById(R.id.imageview1);
		loginemail = findViewById(R.id.loginemail);
		imageview2 = findViewById(R.id.imageview2);
		loginpass = findViewById(R.id.loginpass);
		loginbutton = findViewById(R.id.loginbutton);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		profile_image = findViewById(R.id.profile_image);
		linear9 = findViewById(R.id.linear9);
		linear14 = findViewById(R.id.linear14);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		singupbutton = findViewById(R.id.singupbutton);
		linear12 = findViewById(R.id.linear12);
		imageview4 = findViewById(R.id.imageview4);
		singupname = findViewById(R.id.singupname);
		imageview8 = findViewById(R.id.imageview8);
		age = findViewById(R.id.age);
		imageview5 = findViewById(R.id.imageview5);
		singupemail = findViewById(R.id.singupemail);
		imageview6 = findViewById(R.id.imageview6);
		singuppasswo = findViewById(R.id.singuppasswo);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		auth = FirebaseAuth.getInstance();
		profilePhoto.setType("image/*");
		profilePhoto.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);

		loginbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (loginemail.getText().toString().equals("")) {
					((EditText)loginemail).setError("Enter Email");
				}
				else {
					if (loginpass.getText().toString().equals("")) {
						((EditText)loginpass).setError("Enter Password");
					}
					else {
						auth.signInWithEmailAndPassword(loginemail.getText().toString(), loginpass.getText().toString()).addOnCompleteListener(MainActivity.this, _auth_sign_in_listener);
					}
				}
			}
		});

		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				loginpage.setVisibility(View.GONE);
				singuppage.setVisibility(View.VISIBLE);
			}
		});

		profile_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivityForResult(profilePhoto, REQ_CD_PROFILEPHOTO);
			}
		});

		singupbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ImagePicked) {
					if (singupname.getText().toString().equals("") && (singupemail.getText().toString().equals("") && (singuppasswo.getText().toString().equals("") && age.getText().toString().equals("")))) {
						SketchwareUtil.showMessage(getApplicationContext(), "All fields must filled ");
					}
					else {
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										auth.createUserWithEmailAndPassword(singupemail.getText().toString(), singuppasswo.getText().toString()).addOnCompleteListener(MainActivity.this, _auth_create_user_listener);
										t = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														SketchwareUtil.showMessage(getApplicationContext(), "Please wait...... Uploading your Profile Photo ");
													}
												});
											}
										};
										_timer.schedule(t, (int)(1500));
									}
								});
							}
						};
						_timer.schedule(t, (int)(2000));
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Please first pick your profile image ");
				}
			}
		});

		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				loginpage.setVisibility(View.VISIBLE);
				singuppage.setVisibility(View.GONE);
			}
		});

		_Users_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {

			}

			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);

			}

			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();

			}
		};
		Users.addChildEventListener(_Users_child_listener);



	private void initializeLogic() {
		ImagePicked = false;
		if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
			next.setClass(getApplicationContext(), HomeActivity.class);
			startActivity(next);
		}
		else {

		}
	}

	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);

		switch (_requestCode) {
			case REQ_CD_PROFILEPHOTO:
				if (_resultCode == Activity.RESULT_OK) {
					ArrayList<String> _filePath = new ArrayList<>();
					if (_data != null) {
						if (_data.getClipData() != null) {
							for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
								ClipData.Item _item = _data.getClipData().getItemAt(_index);
								_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
							}
						}
						else {
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
						}
					}
					if (_filePath.get((int)(0)).contains(".jpeg") || (_filePath.get((int)(0)).contains(".jpg") && _filePath.get((int)(0)).contains(".png"))) {
						ImagePicked = false;
					}
					else {
						Image_path = _filePath.get((int)(0));
						ImagePicked = true;
						profile_image.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(Image_path, 1024, 1024));
					}
				}
				else {

				}
				break;
			default:
				break;
		}
	}


	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}


	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}

	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}

	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}

	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}

	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}

	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
