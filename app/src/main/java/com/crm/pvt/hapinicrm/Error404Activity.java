package com.crm.pvt.hapinicrm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Kuldeep Sahu on 04/06/2021.
 * E-mail: sahukuldeep912001@gmail.com
 * http://skywarrior09.gq
 */

public class Error404Activity extends AppCompatActivity {

    private Button closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error404);
        getSupportActionBar().hide();

        closeButton = findViewById(R.id.CloseBtnErrorAC);
        closeButton.setOnClickListener(view -> {
            startActivity(new Intent(Error404Activity.this,MainActivity.class));
        });
    }
}