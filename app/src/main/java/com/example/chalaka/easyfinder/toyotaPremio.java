package com.example.chalaka.easyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class toyotaPremio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota_premio);

        Button goBtn6 = findViewById(R.id.button9);

        goBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toyotaPremio.this, Vehicle.class);
                startActivity(intent);
            }
        });

    }
}
