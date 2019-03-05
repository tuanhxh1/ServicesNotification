package com.example.tuan.servicesnotification;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class StartedService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String tuan = null;
        if (intent != null) {
            tuan = intent.getStringExtra(MainActivity.TUAN);
        }
        Toast.makeText(this, "onStartCommand: "+ tuan, Toast.LENGTH_SHORT).show();
        return START_REDELIVER_INTENT;

    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }


}
