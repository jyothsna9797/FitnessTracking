package com.workout.scout;


import android.app.Activity;
import android.graphics.*;
import android.os.*;
import android.util.*;
import android.view.View;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.*;


public class HomeActivity extends Activity {
	
	private LinearLayout linear1;
	private LinearLayout linear6;
	private LinearLayout linear5;
	private LinearLayout home;
	private LinearLayout history;
	private ScrollView vscroll1;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear25;
	private LinearLayout linear27;
	private LinearLayout linear29;
	private LinearLayout linear33;
	private LinearLayout linear31;
	private LinearLayout linear16;
	private ProgressBar progressbar1;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear18;
	private TextView textview36;
	private TextView textview30;
	private RadioButton radiobutton1;
	private TextView textview31;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear20;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear22;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear24;
	private TextView textview17;
	private TextView textview18;
	private LinearLayout linear26;
	private TextView textview19;
	private TextView textview20;
	private LinearLayout linear28;
	private TextView textview21;
	private TextView textview22;
	private LinearLayout linear30;
	private TextView textview23;
	private TextView textview26;
	private LinearLayout linear34;
	private TextView textview27;
	private TextView textview24;
	private LinearLayout linear32;
	private TextView textview25;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear42;
	private LinearLayout linear47;
	private TextView textview33;
	private TextView textview37;
	private TextView textview38;
	private Button button1;
	private ImageView imageview5;
	private TextView textview39;
	private ImageView imageview6;
	private TextView textview40;
	private LinearLayout linear36;
	private LinearLayout linear3;
	private TextView textview28;
	private TextView textview29;
	private LinearLayout linear37;
	private LinearLayout linear4;
	private ImageView image_hevo3;
	private ImageView image_hevo4;
	private RadioButton radiobutton2;
	private RadioButton radiobutton3;
	private TextView textview5;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private ImageView imageview1;
	private TextView textview1;
	private ImageView imageview2;
	private TextView textview4;
	private ImageView imageview4;
	private TextView textview2;
	private ImageView imageview3;
	private TextView textview3;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear6 = findViewById(R.id.linear6);
		linear5 = findViewById(R.id.linear5);
		home = findViewById(R.id.home);
		history = findViewById(R.id.history);
		vscroll1 = findViewById(R.id.vscroll1);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear17 = findViewById(R.id.linear17);
		linear19 = findViewById(R.id.linear19);
		linear21 = findViewById(R.id.linear21);
		linear23 = findViewById(R.id.linear23);
		linear25 = findViewById(R.id.linear25);
		linear27 = findViewById(R.id.linear27);
		linear29 = findViewById(R.id.linear29);
		linear33 = findViewById(R.id.linear33);
		linear31 = findViewById(R.id.linear31);
		linear16 = findViewById(R.id.linear16);
		progressbar1 = findViewById(R.id.progressbar1);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		linear18 = findViewById(R.id.linear18);
		textview36 = findViewById(R.id.textview36);
		textview30 = findViewById(R.id.textview30);
		radiobutton1 = findViewById(R.id.radiobutton1);
		textview31 = findViewById(R.id.textview31);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		linear20 = findViewById(R.id.linear20);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		linear22 = findViewById(R.id.linear22);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear24 = findViewById(R.id.linear24);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		linear26 = findViewById(R.id.linear26);
		textview19 = findViewById(R.id.textview19);
		textview20 = findViewById(R.id.textview20);
		linear28 = findViewById(R.id.linear28);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
		linear30 = findViewById(R.id.linear30);
		textview23 = findViewById(R.id.textview23);
		textview26 = findViewById(R.id.textview26);
		linear34 = findViewById(R.id.linear34);
		textview27 = findViewById(R.id.textview27);
		textview24 = findViewById(R.id.textview24);
		linear32 = findViewById(R.id.linear32);
		textview25 = findViewById(R.id.textview25);
		linear38 = findViewById(R.id.linear38);
		linear39 = findViewById(R.id.linear39);
		linear40 = findViewById(R.id.linear40);
		linear42 = findViewById(R.id.linear42);
		linear47 = findViewById(R.id.linear47);
		textview33 = findViewById(R.id.textview33);
		textview37 = findViewById(R.id.textview37);
		textview38 = findViewById(R.id.textview38);
		button1 = findViewById(R.id.button1);
		imageview5 = findViewById(R.id.imageview5);
		textview39 = findViewById(R.id.textview39);
		imageview6 = findViewById(R.id.imageview6);
		textview40 = findViewById(R.id.textview40);
		linear36 = findViewById(R.id.linear36);
		linear3 = findViewById(R.id.linear3);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		linear37 = findViewById(R.id.linear37);
		linear4 = findViewById(R.id.linear4);
		image_hevo3 = findViewById(R.id.image_hevo3);
		image_hevo4 = findViewById(R.id.image_hevo4);
		radiobutton2 = findViewById(R.id.radiobutton2);
		radiobutton3 = findViewById(R.id.radiobutton3);
		textview5 = findViewById(R.id.textview5);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		imageview4 = findViewById(R.id.imageview4);
		textview2 = findViewById(R.id.textview2);
		imageview3 = findViewById(R.id.imageview3);
		textview3 = findViewById(R.id.textview3);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.VISIBLE);
				history.setVisibility(View.GONE);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.VISIBLE);

			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.GONE);

			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.GONE);

			}
		});
	}
	

	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _Icon_Colour(final ImageView _iconview, final String _colour) {
		_iconview.getDrawable().setColorFilter(Color.parseColor(_colour), PorterDuff.Mode.SRC_IN);
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
		int index = 2;
		int _location[] = new int[index];
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
