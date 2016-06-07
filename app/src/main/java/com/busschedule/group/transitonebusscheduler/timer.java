package com.busschedule.group.transitonebusscheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class timer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }
    public void buttonOnClick14(View f){


    }
    public void buttonOnClickt2(View f){

        initiate();
    }

    public void initiate() {


        try {


            int input;
            EditText route = (EditText) findViewById(R.id.userinput);

            String inputone = route.getText().toString();
            input = Integer.parseInt(inputone);

            switch (input) {

                case 1:
                    startActivity(new Intent(getApplicationContext(), timer1.class));
                    break;

                case 2:
                    startActivity(new Intent(getApplicationContext(), timer2.class));
                    break;

                case 3:
                    startActivity(new Intent(getApplicationContext(), timer3.class));
                    break;

                case 4:
                    startActivity(new Intent(getApplicationContext(), timer4.class));
                    break;

                case 5:
                    startActivity(new Intent(getApplicationContext(), timer5.class));
                    break;

                case 6:
                    startActivity(new Intent(getApplicationContext(), timer6.class));
                    break;



                default:

                    route.setText("1-6 Only!");

                    break;
            }


        } catch (Exception e) {

            EditText route = (EditText) findViewById(R.id.userinput);
            route.setText("Wrong Character[s]");

        }


    }
    }
