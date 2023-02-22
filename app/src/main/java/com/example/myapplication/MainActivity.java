package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//Herencia

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate OK", Toast.LENGTH_LONG).show();
    }
        @Override
        protected void onStart() {
            super.onStart();
            Toast.makeText(this, "OnStart OK", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Toast.makeText(this, "OnResume OK", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onPause() {
            super.onPause();
            Toast.makeText(this, "OnPause OK", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onStop() {
            super.onStop();
            Toast.makeText(this, "OnStop OK", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "OnDestroy OK", Toast.LENGTH_LONG).show();
        }

}