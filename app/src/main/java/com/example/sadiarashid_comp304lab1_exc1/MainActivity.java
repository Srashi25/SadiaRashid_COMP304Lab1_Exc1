package com.example.sadiarashid_comp304lab1_exc1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // DECLARE INSTANCE variables
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Event Handler for the click event of Send button
    public void onClickSend(View view)
    {
        //read the message from edit text
        // //and send it to the DisplayActivity
        // 1- make a reference to the edit Text
        editTextMessage = findViewById(R.id.editTextMessage);
        //2- get the message or the text from edit text
        String message = editTextMessage.getText().toString();
        //3- Create an intent object to hold this message
        Intent intent =new  Intent(this,  DisplayActivity.class);
        //4- put the message in the intent object
        intent.putExtra("MyMessage",message);
        //5- Start the DisplayActivity   // Session object takes the objects
        startActivity(intent);

    }
}
