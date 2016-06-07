package com.busschedule.group.transitonebusscheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Busroute extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busroute);
    }
    public void buttonOnClick5(View f){

        initiate();
    }

    public void buttonOnClick14(View f){


    }
    public void initiate(){


        try{


            int input;
            EditText route = (EditText) findViewById(R.id.userinput);

            String inputone = route.getText().toString();
            input = Integer.parseInt(inputone);

                switch ( input ) {

                    case 1:
                        startActivity(new Intent(getApplicationContext(), route1.class));
                    break;

                    case 2:
                        startActivity(new Intent(getApplicationContext(), route2.class));
                    break;

                    case 3:
                        startActivity(new Intent(getApplicationContext(), route3.class));
                    break;

                    case 4:
                        startActivity(new Intent(getApplicationContext(), route4.class));
                    break;

                    case 5:
                        startActivity(new Intent(getApplicationContext(), route5.class));
                    break;

                    case 6:
                        startActivity(new Intent(getApplicationContext(), route6.class));
                    break;

                    case 7:
                        startActivity(new Intent(getApplicationContext(), route7.class));
                    break;

                    case 8:
                        startActivity(new Intent(getApplicationContext(), route8.class));
                    break;

                    case 9:
                        startActivity(new Intent(getApplicationContext(), route9.class));
                    break;

                    case 10:
                        startActivity(new Intent(getApplicationContext(), route10.class));
                    break;

                    default:

                        route.setText("1-10 Only!");

                    break;
            }



            }catch(Exception e) {

                EditText route = (EditText) findViewById(R.id.userinput);
                    route.setText("Wrong Character[s]");

        }



    }
}
