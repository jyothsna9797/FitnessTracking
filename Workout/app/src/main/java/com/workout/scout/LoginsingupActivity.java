package com.workout.scout;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.*;


public class LoginsingupActivity extends Activity {
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout login_layout;
	private LinearLayout signup_layout;
	private ImageView imageview1;
	private TextView textview2;
	private EditText edittext1;
	private EditText edittext2;
	private Button button1;
	private TextView textview4;
	private LinearLayout linear2;
	private ImageView imageview2;
	private TextView textview6;
	private EditText edittext5;
	private EditText edittext3;
	private EditText edittext4;
	private Button button2;
	private TextView textview8;
	
	private Intent next = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.loginsingup);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		login_layout = findViewById(R.id.login_layout);
		signup_layout = findViewById(R.id.signup_layout);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		button1 = findViewById(R.id.button1);
		textview4 = findViewById(R.id.textview4);
		linear2 = findViewById(R.id.linear2);
		imageview2 = findViewById(R.id.imageview2);
		textview6 = findViewById(R.id.textview6);
		edittext5 = findViewById(R.id.edittext5);
		edittext3 = findViewById(R.id.edittext3);
		edittext4 = findViewById(R.id.edittext4);
		button2 = findViewById(R.id.button2);
		textview8 = findViewById(R.id.textview8);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				next.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(next);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				login_layout.setVisibility(View.GONE);
				signup_layout.setVisibility(View.VISIBLE);
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				login_layout.setVisibility(View.VISIBLE);
				signup_layout.setVisibility(View.GONE);
			}
		});
	}
	
	private void initializeLogic() {
		signup_layout.setVisibility(View.GONE);
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
