package com.example.samsung.p0231_oneactivitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String TAG = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, getString(R.string.activity_is_created));
        Toast.makeText(this, R.string.activity_is_created, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, getString(R.string.activity_is_started));
        Toast.makeText(this, R.string.activity_is_started, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, getString(R.string.activity_is_resume));
        Toast.makeText(this, R.string.activity_is_resume, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, getString(R.string.activity_is_paused));
        Toast.makeText(this, R.string.activity_is_paused, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, getString(R.string.activity_is_stopped));
        Toast.makeText(this, R.string.activity_is_stopped, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, getString(R.string.activity_is_destroyed));
        Toast.makeText(this, R.string.activity_is_destroyed, Toast.LENGTH_LONG).show();
    }
}
