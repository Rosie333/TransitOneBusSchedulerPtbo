package com.busschedule.group.transitonebusscheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }
    public void buttonOnClick1(View v){
        Button button=(Button) v;
        startActivity(new Intent(getApplicationContext(), Busroute.class));
    }
    public void buttonOnClick2(View v){

        startActivity(new Intent(getApplicationContext(), TwitterPage.class));
    }
    public void buttonOnClick3(View v){

        startActivity(new Intent(getApplicationContext(), timer.class));
    }
    public void buttonOnClick6(View v){


        startActivity(new Intent(getApplicationContext(), locationsmap.class));
    }
}
