package com.example.chrisantus.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.editText1);
        Age = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Get the text and put in the String variables
                String UserName = Name.getText().toString();
                String UserAge = Age.getText().toString();

                //Explicit Intent , These intents designate the target component by its name and they
                //are typically used for application-internal messages-such as an activity
                //starting a subordinate service or launching a sister activity.
                Intent intent = new Intent(getApplicationContext(), NewActivity.class);
                //getApplicationContext() : Make a context object.
                intent.putExtra("loginName", UserName);
                intent.putExtra("loginAge", UserAge);
                startActivity(intent);
                // Via startActivity, We push intent object to Android System.
            }
        });
    }
}
