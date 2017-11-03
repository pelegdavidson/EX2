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
    final String MY_TAG="EX2.MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "On Create Event");
        Toast.makeText(this, "hello this is your java coding experience", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "On Start Event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "On Resume Event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "On Pause Event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "On Stop Event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "On Destroy Event");
    }
    public void buttonClicked(View v){

        EditText edName = (EditText) findViewById(R.id.input);
        if(edName.getText().length()==0){
            Toast.makeText(this, "you must enter your name before clicking", Toast.LENGTH_LONG).show();
        }
        else{
            cnt++;
            Toast.makeText(this, edName.getText()+", you clicked "+cnt+" times", Toast.LENGTH_LONG).show();
        }
    }
}
