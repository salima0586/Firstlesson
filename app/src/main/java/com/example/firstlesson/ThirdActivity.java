package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    private Button btnEnter;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnEnter = findViewById(R.id.btn_enter_number);
        editText = findViewById(R.id.ed_enter_number);



        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(editText.getText().toString());

                Intent intent = new Intent(ThirdActivity.this,secondActivity.class);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });
    }
}