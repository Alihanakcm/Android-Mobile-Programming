package com.example.screennavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


//     Question 1: Toolbar
//     Question 2: Çünkü GridLayout grid(ızgara)  yapısından dolay eleman yerleştirmek için daha avantajlı bir kullanım sağlar.
//     Question 3: In activity_main.xml for the MainActivity.
//     Question 4: To provide the Up button for a child screen activity, declare the child activity's parent in the activity_main.xml file.
//     Question 5: Use the following code in a public method (assuming the other activity is called OtherActivity):
//    Intent intent = new Intent(this, OtherActivity.class); startActivity(intent);
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.donut_circle);
        imageView2 = findViewById(R.id.froyo_circle);
        imageView3 = findViewById(R.id.icecream_circle);

        toolbar = findViewById(R.id.toolbar);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DonutCircle.class);
                startActivity(intent);

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FroyoCircle.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IcecreamCircle.class);
                startActivity(intent);
            }
        });
    }


}
