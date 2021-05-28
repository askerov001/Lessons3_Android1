package com.example.lessons3_android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.BitSet;

public class FragmentActivity extends AppCompatActivity {
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    private Button first, second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container,firstFragment)
                .commit();

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             getSupportFragmentManager().beginTransaction()

             .replace(R.id.container,firstFragment)
                     .addToBackStack(null)
                     .commit();
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container,secondFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}