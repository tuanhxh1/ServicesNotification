package com.example.tuan.servicesnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button buttonStart, buttonStop;
    public static final String TUAN = "tuanld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStartService);
        buttonStop = findViewById(R.id.buttonStopService);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StartedService.class);
        switch (v.getId()) {
            case R.id.buttonStartService:
                intent.putExtra(TUAN, "tuanld123");
                startService(intent);
                break;
            case R.id.buttonStopService:
                stopService(intent);
                break;
        }
    }
}
