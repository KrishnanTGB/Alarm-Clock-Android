package com.krish.Krishnan_Exp14;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyActivity extends Activity {

    Button b1;
    EditText e1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startalert();}
        });}
    public void startalert()
    {
        int i = Integer.parseInt(e1.getText().toString());
        Intent in = new Intent(this,alarm.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 900000, in, 0);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), pendingIntent);
        Toast.makeText(getApplicationContext(), "Alarm will be ring in " + i + " Seconds", Toast.LENGTH_LONG).show();
    }


}

