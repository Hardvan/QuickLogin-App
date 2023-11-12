package com.example.quickloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_username = findViewById(R.id.et_username);
        EditText et_password = findViewById(R.id.et_password);

        Button bt_login = findViewById(R.id.bt_login);

        ImageButton bt_google = findViewById(R.id.bt_google);
        ImageButton bt_twitter = findViewById(R.id.bt_twitter);


        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (username.equals("Hardvan") && password.equals("Password")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Retry Login.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        bt_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                directToGoogle();

            }
        });

        bt_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                directToTwitter();

            }
        });


    }

    public void directToGoogle() {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(browserIntent);

    }

    public void directToTwitter() {

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
        startActivity(browserIntent);

    }

}