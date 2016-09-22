package com.example.hectorvera.startaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_CAT = "FMT ";
    EditText putText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        putText = ((EditText) findViewById(R.id.putText));
        Log.d(LOG_CAT, "Activity 1 --> onCreate");
    }

    public void onGo(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("name", putText.getText().toString());
        Log.d(LOG_CAT, "Activity 1 --> onGo");
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK){
            String tmp = data.getStringExtra("name2");
            putText.setText(tmp);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_CAT, "Activity 1 --> onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_CAT, "Activity 1 --> onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_CAT, "Activity 1 --> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_CAT, "Activity 1 --> onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_CAT, "Activity 1 --> onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_CAT, "Activity 1 --> onStop");
    }
}
