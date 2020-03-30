package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//     Question 1: The major difference is that checkboxes enable multiple selections, while a RadioGroup allows only one selection.
//     Question 2: LinearLayout
//     Question 3: isChecked()

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.chocolate_syrup);
        checkBox2 = findViewById(R.id.sprinkles);
        checkBox3 = findViewById(R.id.crushed_nuts);
        checkBox4 = findViewById(R.id.cherries);
        checkBox5 = findViewById(R.id.orio_cookie_crumbles);
        button = findViewById(R.id.button);

        final CheckBox[] checkBoxes = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5};

        for (final CheckBox checkBox : checkBoxes) {
            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), checkBox.getText(), Toast.LENGTH_LONG).show();
                }
            });
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toastMessage = "";
                for (CheckBox checkBox : checkBoxes) {
                    if (checkBox.isChecked())
                        toastMessage += checkBox.getText() + " ";
                }
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG).show();
            }
        });
    }
}
