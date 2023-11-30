package com.marco.project_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void onNotificationsClick(View view) {
        // Add your code here to handle the click event for notifications
        // For example, you can open a new activity or show a dialog
        Toast.makeText(this, "Notifications Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


    }
}