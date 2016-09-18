package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button movieButton;
    private Button hawkButton;
    private Button buildButton;
    private Button materialButton;
    private Button ubiquitousButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieButton = (Button) findViewById(R.id.movies_button);
        movieButton.setOnClickListener(onClickListener);

        hawkButton = (Button) findViewById(R.id.hawk_button);
        hawkButton.setOnClickListener(onClickListener);

        buildButton = (Button) findViewById(R.id.build_button);
        buildButton.setOnClickListener(onClickListener);

        materialButton = (Button) findViewById(R.id.material_button);
        materialButton.setOnClickListener(onClickListener);

        ubiquitousButton = (Button) findViewById(R.id.ubiquitous_button);
        ubiquitousButton.setOnClickListener(onClickListener);

        capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.movies_button:
                    Toast.makeText(MainActivity.this, R.string.moviesToast, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.hawk_button:
                    Toast.makeText(MainActivity.this, R.string.hawkToast, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.build_button:
                    Toast.makeText(MainActivity.this, R.string.buildToast, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.material_button:
                    Toast.makeText(MainActivity.this, R.string.materialToast, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ubiquitous_button:
                    Toast.makeText(MainActivity.this, R.string.ubiquitousToast, Toast.LENGTH_SHORT).show();

                    break;
                case R.id.capstone_button:
                    Toast.makeText(MainActivity.this, R.string.capstoneToast, Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
