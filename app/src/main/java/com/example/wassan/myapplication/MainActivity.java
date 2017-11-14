package com.example.wassan.myapplication;

import android.app.Application;
import android.hardware.camera2.TotalCaptureResult;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int tl = Toast.LENGTH_LONG;
    private static String Message = " ";
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Message = "onCreate() called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Message = "onStart() Called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Message = "onPause() Called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Message = "onResume() Called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Message = "onRestart() Called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Message = "onStop() Called";
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onSaveInstanceState(Bundle OutState)
    {
        super.onSaveInstanceState(OutState);
        Message = "onSaveInstanceState() called";
        Message += "BundleSpaceMapping = " + OutState.size();
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        Message = "onRestoreInstanceState() called";
        Message += "BundleSpaceMapping = " + savedInstanceState.size();
        Toast.makeText(this,Message,tl).show();
        Log.i(TAG,Message);
    }
}
