package com.example.temp_converter_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText celsiusEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusEditText = findViewById(R.id.celsiusEditText);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultTextView);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertTemperature();
            }
        });
    }

    private void convertTemperature() {
        String celsiusString = celsiusEditText.getText().toString();
        if (!celsiusString.isEmpty()) {
            double celsius = Double.parseDouble(celsiusString);
            double fahrenheit = (celsius * 9 / 5) + 32;
            resultTextView.setText(String.format("%.2f °F", fahrenheit));
        } else {
            resultTextView.setText("Please enter a temperature in Celsius.");
        }
    }
}