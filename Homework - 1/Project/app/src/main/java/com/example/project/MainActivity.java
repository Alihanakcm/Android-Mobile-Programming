package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class MainActivity extends AppCompatActivity {

    // Question1: activity_main.xml
    // Question2: strings.xml
    // Question3: AVD Manager
    // Question4: Device 1 => Nexus 4
    // Question4: Device 2 => Nexus 9
    // Question5: Verbose, Debug, Info
    // Question6: Her activity sayfasına log mesajı koyarak sağlayabiliriz.



    // Question1: layout_constraintBottom_toBottomOf ve layout_constraintTop_toTopOf
    // Question2: layout_constraintBottom_toBottomOf ve layout_constraintTop_toTopOf
    // Question3: Her iki işlemde çalışır
    // Question4: public void callMethod(View view)
    // Question5: view parametresini kullanmak

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        zeroButton = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), R.string.toast_button_toast, Toast.LENGTH_LONG).show();

    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            zeroButton.setBackgroundResource(R.color.zeroButton);
            view.setBackgroundResource(R.color.activeButton);
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundResource(R.color.buttonZeroBackground);
    }
}
