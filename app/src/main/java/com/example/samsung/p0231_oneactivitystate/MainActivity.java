package com.example.samsung.p0231_oneactivitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    final String TAG = "lifecycle";
    Button btnActTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, getString(R.string.activity_1_is_created));
        Toast.makeText(this, R.string.activity_1_is_created, Toast.LENGTH_LONG).show();

        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, getString(R.string.activity_1_is_restarted));
        Toast.makeText(this, R.string.activity_1_is_restarted, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {

        super.onStart();

        Log.d(TAG, getString(R.string.activity_1_is_started));
        Toast.makeText(this, R.string.activity_1_is_started, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {

        super.onResume();

        Log.d(TAG, getString(R.string.activity_1_is_resume));
        Toast.makeText(this, R.string.activity_1_is_resume, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {

        super.onPause();

        Log.d(TAG, getString(R.string.activity_1_is_paused));
        Toast.makeText(this, R.string.activity_1_is_paused, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {

        super.onStop();

        Log.d(TAG, getString(R.string.activity_1_is_stopped));
        Toast.makeText(this, R.string.activity_1_is_stopped, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

        Log.d(TAG, getString(R.string.activity_1_is_destroyed));
        Toast.makeText(this, R.string.activity_1_is_destroyed, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnActTwo :
                Intent intent = new Intent(this, TwoActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}
