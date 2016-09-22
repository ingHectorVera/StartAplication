package com.example.hectorvera.startaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String LOG_CAT = "FMT ";
    EditText txtName;
    TextView txtName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = ((EditText) findViewById(R.id.myLbl));

        Intent i = getIntent();
        txtName.setText(i.getStringExtra("name"));
        Log.d(LOG_CAT, "Activity 2 --> onCreate");
    }

    public void onBack(View view) {
        Intent i = new Intent();
        i.putExtra("name2", txtName2.getText().toString() + " back");
        setResult(RESULT_OK, i);
        finish();
    }

    public void onSet(View view) {
        txtName2 = ((TextView) findViewById(R.id.txtView));
        txtName2.setText(txtName.getText().toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("nameSI",txtName2.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtName.setText(savedInstanceState.getString("nameSI", "Default"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG_CAT, "Activity 2--> onBackPressed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_CAT, "Activity 2 --> onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_CAT, "Activity 2 --> onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_CAT, "Activity 2 --> onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_CAT, "Activity 2 --> onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_CAT, "Activity 2 --> onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_CAT, "Activity 2--> onStop");
    }
}
