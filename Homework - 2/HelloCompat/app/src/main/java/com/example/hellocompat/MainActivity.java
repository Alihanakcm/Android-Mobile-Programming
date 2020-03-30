package com.example.hellocompat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

//     Question 1: ContextCompact çalıştığında ilk olarak cihazın SDK sürümü kontrol edilmektedir.
//     SDK sürümünün 23'den küçük olması yada eşit ve büyük olması durumuna göre farklı senaryolar oluşmaktadır.
//     Question 2: Bunun sebebi kullanılan aracın mevcut SDK sürümü tarafından desteklenip desteklenmemesine göre kullanılmaktadır.
//     Eğer desteklenmiyorsa eksik hatalı çalışabilir.

    private TextView mmHelloTextView;
    private String[] mColorArray = {
            "red",
            "pink",
            "purple",
            "deep_purple",
            "indigo",
            "blue",
            "light_blue",
            "cyan",
            "teal",
            "green",
            "light_green",
            "lime",
            "yellow",
            "amber",
            "orange",
            "deep_orange",
            "brown",
            "grey",
            "blue_grey",
            "black"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mmHelloTextView = findViewById(R.id.hello_textview);

        if (savedInstanceState != null)
            mmHelloTextView.setTextColor(savedInstanceState.getInt("color"));
    }

    public void changeColor(View view) {
        Random random = new Random();
        String colorName = mColorArray[random.nextInt(20)];

        int colorResourceName = getResources().getIdentifier(colorName, "color", getApplicationContext().getPackageName());

        int colorRes = ContextCompat.getColor(this, colorResourceName);

        mmHelloTextView.setTextColor(colorRes);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("color", mmHelloTextView.getCurrentTextColor());
    }
}
