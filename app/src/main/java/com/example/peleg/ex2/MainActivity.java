package com.example.peleg.ex2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private int cnt;

    final String MY_TAG = "EX2.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, getString(R.string.create));
        if(savedInstanceState==null){
            Toast.makeText(this, getString(R.string.introMessage), Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, getString(R.string.start));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, getString(R.string.resume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, getString(R.string.pause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, getString(R.string.stop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, getString(R.string.destroy));
    }

    public void buttonClicked(View v) {

        EditText edName = (EditText) findViewById(R.id.input);
        if (edName.getText().length() == 0) {
            Toast.makeText(this, getString(R.string.notClicked), Toast.LENGTH_LONG).show();
        } else {
            cnt++;
            Toast.makeText(this, edName.getText() + getString(R.string.clickCnt1) + cnt + getString(R.string.clickCnt2), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("Counter", cnt);

        super.onSaveInstanceState(savedInstanceState);
        Log.i(MY_TAG, "on save instance state event");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState!=null) {
            cnt = (int) savedInstanceState.getInt("Counter");

        }

        Log.i(MY_TAG, "on restore instance state event");
    }

}
