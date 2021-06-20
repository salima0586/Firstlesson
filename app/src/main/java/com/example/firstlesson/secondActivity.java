package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    private Button btnContinue;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnContinue = findViewById(R.id.btn_continue);
        textView = findViewById(R.id.txt_get_data);


       Intent intent = getIntent();
       if (intent != null){
           int number =  intent.getIntExtra("number",312);
           textView.setText(String.valueOf(number));
       }


        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });


    }
}