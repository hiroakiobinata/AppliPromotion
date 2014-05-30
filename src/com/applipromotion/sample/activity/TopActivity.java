package com.applipromotion.sample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.applipromotion.sample.R;

public class TopActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.top);

		// Wall広告表示
		Button showWall = (Button) findViewById(R.id.show_wall);
		showWall.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ShowWallActivity.class);
				startActivity(intent);
			}
		});

		// Wall当日未読の確認
		Button isFirstOnToday = (Button) findViewById(R.id.is_first_on_today);
		isFirstOnToday.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), IsFirstOnTodaylActivity.class);
				startActivity(intent);
			}
		});

		// Wall広告誘導イメージ
		Button showTrigger = (Button) findViewById(R.id.show_trigger);
		showTrigger.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), ShowTriggerActivity.class);
				startActivity(intent);
			}
		});

		// 広告誘導ポップアップ
		Button startPopup = (Button) findViewById(R.id.start_popup);
		startPopup.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), StartPopupActivity.class);
				startActivity(intent);
			}
		});

		// コンバージョン計測
		Button sendUuid = (Button) findViewById(R.id.send_uuid);
		sendUuid.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), SendUuidActivity.class);
				startActivity(intent);
			}
		});

	}
}
