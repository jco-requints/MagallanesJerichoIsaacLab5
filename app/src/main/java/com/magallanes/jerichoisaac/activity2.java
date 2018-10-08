package com.magallanes.jerichoisaac;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        Log.d("4IT-H", "onCreate() has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4IT-H", "onStart() has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4IT-H", "onResume() has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4IT-H", "onStop() has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4IT-H","onDestroy() has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4IT-H", "onRestart() has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4IT-H", "onPause() has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(android.view.View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.activity1) {

            i = new Intent(this, main_activity.class);

            startActivity(i);
        }
        else if(v.getId()==R.id.map){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.536974, 120.993601"));

            chooser= Intent.createChooser(i, "Select Map");

            startActivity(chooser);

        }
    }
}
