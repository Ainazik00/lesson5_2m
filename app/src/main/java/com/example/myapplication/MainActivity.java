package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView textView=findViewById(R.id.text_view);
        EditText editText=findViewById(R.id.et_text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String text = editText.getText().toString();

               if (text.isEmpty()) {
                   textView.setText("Вы не ввели текст");
               } else {
                   textView.setText(text);
               }
               textView.setText(text);

            }
        });
    }
}