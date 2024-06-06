package com.example.trash;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.trashinformation.R;

public class NotificationActivity extends AppCompatActivity {
    TextView textNotifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notification);
        textNotifi = findViewById(R.id.textnotifiData);
        //get info from welcom activity
        String data = getIntent().getStringExtra("data");
        textNotifi.setText(data);
    }
}