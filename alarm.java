package com.omkarpatil.coronashield;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class alarm extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"ALARM..",Toast.LENGTH_LONG);
        Vibrator v = (Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(5000);
       Toast.makeText(context,"Alarm Set",Toast.LENGTH_LONG).show();

    }
}
