package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button show_count;
private int mCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_count=findViewById(R.id.button);
        show_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"Button Toast Clicked",Toast.LENGTH_SHORT).show();
    }
    public void countUp(View view){

        ++mCount;
        if (show_count != null)
            show_count.setText(Integer.toString(mCount));
    }
}