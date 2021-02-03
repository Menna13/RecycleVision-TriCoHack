package org.tensorflow.lite.examples.classification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.examples.classification.env.ImageUtils;

public class MainActivity extends AppCompatActivity {
    Button btnScan;
    Button btnInput;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        btnInput = findViewById(R.id.btnInput);


        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beginScan();
            }
        });

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beginInput();
            }
        });
    }

    private void beginScan() {
        Intent i = new Intent(this, ClassifierActivity.class);
        startActivity(i);
    }

    private void beginInput() {
        Intent i = new Intent(this, RecycleInput.class);
        startActivity(i);
    }
}