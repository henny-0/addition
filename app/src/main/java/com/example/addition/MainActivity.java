package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = findViewById(R.id.add);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView result = findViewById(R.id.resultTextView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    boolean check1 = num1.getText().toString().isEmpty();
                    boolean check2 = num2.getText().toString().isEmpty();
                    if (check1 || check2) {
                    Toast.makeText(MainActivity.this,"Check to ensure that you have both values",Toast.LENGTH_LONG ).show();

                    } else {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());

                        int re = n1 + n2;


                        result.setText("Result: " + re);
                    }
                }

                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Something is wrong",Toast.LENGTH_LONG ).show();
                }
            }
        });

    }
}