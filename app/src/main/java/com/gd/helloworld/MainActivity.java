package com.gd.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public static final String EXTRA_MSG = "com.gd.helloworld.MESSAGE";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  /* Called when user taps send button */
  public void sendMsg(View view){
    Intent intent = new Intent(this, DisplayMsgActivity.class);
    EditText editText = (EditText) findViewById(R.id.editText);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MSG, message);
    startActivity(intent);
  }
}
