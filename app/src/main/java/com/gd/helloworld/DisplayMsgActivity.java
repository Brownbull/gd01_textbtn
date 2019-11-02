package com.gd.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMsgActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_msg);

    // Get the intent that started this activity and extract info
    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MSG);

    // Capture layout-s textView and set the string as its text
    TextView textView = findViewById(R.id.textView);
    textView.setText(message);
  }
}
