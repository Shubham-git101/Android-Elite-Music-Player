package com.example.elitemusic;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ApplicationClass extends Application {
    public static final String CHANNEL_ID_1 = "CHANNEL_1";
    public static final String CHANNEL_ID_2 = "CHANNEL_2";
    public static final String ACTION_NEXT = "actionnext";
    public static final String ACTION_PREVIOUS = "actionprevious";
    public static final String ACTION_PLAY = "actionplay";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
        {
            NotificationChannel channel1 = new NotificationChannel(CHANNEL_ID_1,
                    "Channel(1)", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Channel 1 Description");

            NotificationChannel channel2 = new NotificationChannel(CHANNEL_ID_2,
                    "Channel(2)", NotificationManager.IMPORTANCE_HIGH);
            channel2.setDescription("Channel 2 Description");

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel1);
            notificationManager.createNotificationChannel(channel2);

        }
    }
}
