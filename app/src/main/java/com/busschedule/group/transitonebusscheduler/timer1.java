package com.busschedule.group.transitonebusscheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class timer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer1);
    }

    public void check1(View x) {
        Button button = (Button) x;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String timer = ( sdf.format(cal.getTime()) );
            //testing this by outputting it on to the button.
            ((Button) x).setText(timer);







    }



}
