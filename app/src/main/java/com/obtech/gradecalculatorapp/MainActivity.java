// Declares the package name for the Java file.
package com.obtech.gradecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextStudentName;
    private EditText editTextMathScore;
    private EditText editTextScienceScore;
    private EditText editTextEnglishScore;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextStudentName = findViewById(R.id.editTextStudentName);
        editTextMathScore = findViewById(R.id.editTextMathScore);
        editTextScienceScore = findViewById(R.id.editTextScienceScore);
        editTextEnglishScore = findViewById(R.id.editTextEnglishScore);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcGrade();
            }
        });
    }

    private void calcGrade() {
        String nme = editTextStudentName.getText().toString().trim();
        String mathScoreStr = editTextMathScore.getText().toString().trim();
        String scienceScoreStr = editTextScienceScore.getText().toString().trim();
        String englishScoreStr = editTextEnglishScore.getText().toString().trim();

        if (nme.isEmpty() || mathScoreStr.isEmpty() || scienceScoreStr.isEmpty() || englishScoreStr.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double mathScore = Double.parseDouble(mathScoreStr);
            double scienceScore = Double.parseDouble(scienceScoreStr);
            double englishScore = Double.parseDouble(englishScoreStr);

            double averageScore = (mathScore + scienceScore + englishScore) / 3;
            String grade;

            if (averageScore >= 90) {
                grade = "A";
            } else if (averageScore >= 80) {
                grade = "B";
            } else if (averageScore >= 70) {
                grade = "C";
            } else {
                grade = "F";
            }

            String result = "Name: " + nme + "\nAverage Score: " + averageScore + "\nGrade: " + grade;
            textViewResult.setText(result);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input. Please enter valid scores.", Toast.LENGTH_SHORT).show();
        }
    }
}
