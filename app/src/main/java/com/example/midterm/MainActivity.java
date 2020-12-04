package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<button> extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        EditText emailid = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword);
    }
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(editTextTextEmailAddress2.getText().toString().equals("sayyamjain07@gmail.com") && editTextTextPassword.getText().toString().equals("123")) {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
            else{
                editTextTextPassword.setError("Incorrect username or password");
            }


}