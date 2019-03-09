package com.krish.Krishnan_Exp14;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;
import com.krish.Krishnan_Exp14.R;

public class alarm extends BroadcastReceiver {
    MediaPlayer m;
    public void onReceive(Context context,Intent intent)
    {
        m = MediaPlayer.create(context, R.raw.audio);
        m.start();
        Toast.makeText(context, "Alarm....Get up", Toast.LENGTH_LONG).show();
    }}
