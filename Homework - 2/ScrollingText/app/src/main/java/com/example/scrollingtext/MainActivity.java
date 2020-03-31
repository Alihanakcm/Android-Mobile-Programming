package com.example.scrollingtext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Question 1: Dosya adı : floating_context_menu dosya konumu : /ScrollingText/app/src/main/res/menu/floating_context_menu.xml
    // Question 2: When a registered view receives a long-click event, the system calls the onCreateContextMenu() method, which you
    //can override in your activity or fragment.
    // Question 3: Use registerForContextMenu() in the onCreate() method.
    // Question 4: In the onCreateContextMenu() method.

    private TextView article;
    ClipboardManager clipboardManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        article = findViewById(R.id.article);

        article.setMovementMethod(new ScrollingMovementMethod());

        clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        registerForContextMenu(article);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.floating_context_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.floating_context_menu, menu);
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.edit:
                Log.i("Item", "Edit");
                break;
            case R.id.share:
                Log.i("Item", "Share");
                break;
            case R.id.delete:
                Log.i("Item", "Delete");
                break;
            default:
        }
        return super.onContextItemSelected(item);

    }
}
