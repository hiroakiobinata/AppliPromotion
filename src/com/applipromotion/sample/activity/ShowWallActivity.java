package com.applipromotion.sample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.amoad.amoadsdk.AMoAdSdkWallActivity;
import com.applipromotion.sample.R;

public class ShowWallActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_wall);

		Button showWall = (Button) findViewById(R.id.show_wall_btn);
		showWall.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ShowWallActivity.this, AMoAdSdkWallActivity.class);
				// ウォール広告を表示する
				startActivity(intent);
			}
		});

		Button showWallKey = (Button) findViewById(R.id.show_wall_key);
		showWallKey.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ShowWallActivity.this, AMoAdSdkWallActivity.class);
				intent.putExtra("appKey", "");
				// ウォール広告を表示する
				startActivity(intent);
			}
		});

	}
}
