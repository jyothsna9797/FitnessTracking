package com.workout.scout;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeActivity extends Activity {
	
	private LinearLayout linear1;
	private LinearLayout linear6;
	private LinearLayout linear5;
	private LinearLayout home;
	private LinearLayout history;
	private LinearLayout profile;
	private LinearLayout settings;
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
	private ScrollView vscroll2;
	private LinearLayout linear48;
	private TextView textview41;
	private LinearLayout p1base;
	private LinearLayout p2base;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private ImageView imageview8;
	private LinearLayout linear54;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private LinearLayout linear58;
	private LinearLayout linear57;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear65;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private TextView textview46;
	private TextView textview75;
	private TextView textview48;
	private ImageView imageview9;
	private TextView textview50;
	private TextView textview76;
	private TextView textview53;
	private TextView textview77;
	private TextView textview55;
	private TextView textview78;
	private TextView textview57;
	private TextView textview79;
	private TextView textview59;
	private TextView textview80;
	private TextView textview63;
	private TextView textview81;
	private TextView textview65;
	private TextView textview82;
	private TextView textview68;
	private TextView textview71;
	private TextView textview73;
	private TextView textview72;
	private TextView textview74;
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
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear6 = findViewById(R.id.linear6);
		linear5 = findViewById(R.id.linear5);
		home = findViewById(R.id.home);
		history = findViewById(R.id.history);
		profile = findViewById(R.id.profile);
		settings = findViewById(R.id.settings);
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
		vscroll2 = findViewById(R.id.vscroll2);
		linear48 = findViewById(R.id.linear48);
		textview41 = findViewById(R.id.textview41);
		p1base = findViewById(R.id.p1base);
		p2base = findViewById(R.id.p2base);
		linear51 = findViewById(R.id.linear51);
		linear52 = findViewById(R.id.linear52);
		imageview8 = findViewById(R.id.imageview8);
		linear54 = findViewById(R.id.linear54);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		linear58 = findViewById(R.id.linear58);
		linear57 = findViewById(R.id.linear57);
		linear60 = findViewById(R.id.linear60);
		linear61 = findViewById(R.id.linear61);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linear65 = findViewById(R.id.linear65);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		linear69 = findViewById(R.id.linear69);
		linear70 = findViewById(R.id.linear70);
		textview46 = findViewById(R.id.textview46);
		textview75 = findViewById(R.id.textview75);
		textview48 = findViewById(R.id.textview48);
		imageview9 = findViewById(R.id.imageview9);
		textview50 = findViewById(R.id.textview50);
		textview76 = findViewById(R.id.textview76);
		textview53 = findViewById(R.id.textview53);
		textview77 = findViewById(R.id.textview77);
		textview55 = findViewById(R.id.textview55);
		textview78 = findViewById(R.id.textview78);
		textview57 = findViewById(R.id.textview57);
		textview79 = findViewById(R.id.textview79);
		textview59 = findViewById(R.id.textview59);
		textview80 = findViewById(R.id.textview80);
		textview63 = findViewById(R.id.textview63);
		textview81 = findViewById(R.id.textview81);
		textview65 = findViewById(R.id.textview65);
		textview82 = findViewById(R.id.textview82);
		textview68 = findViewById(R.id.textview68);
		textview71 = findViewById(R.id.textview71);
		textview73 = findViewById(R.id.textview73);
		textview72 = findViewById(R.id.textview72);
		textview74 = findViewById(R.id.textview74);
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
		
		textview44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				p1base.setVisibility(View.GONE);
				p2base.setVisibility(View.VISIBLE);
			}
		});
		
		textview74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				p1base.setVisibility(View.VISIBLE);
				p2base.setVisibility(View.GONE);
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.VISIBLE);
				history.setVisibility(View.GONE);
				profile.setVisibility(View.GONE);
				settings.setVisibility(View.GONE);
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.VISIBLE);
				profile.setVisibility(View.GONE);
				settings.setVisibility(View.GONE);
			}
		});
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.GONE);
				profile.setVisibility(View.VISIBLE);
				settings.setVisibility(View.GONE);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				home.setVisibility(View.GONE);
				history.setVisibility(View.GONE);
				profile.setVisibility(View.GONE);
				settings.setVisibility(View.VISIBLE);
			}
		});
	}
	
	private void initializeLogic() {
		p2base.setVisibility(View.GONE);
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
