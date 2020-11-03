package com.mirai.readitback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageButton settings;
    private LinearLayout phrases_ll, conversations_ll, books_ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = (ImageButton) findViewById(R.id.settings_image_button);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_settings();
            }
        });

        phrases_ll = (LinearLayout) findViewById(R.id.phrases_linear_layout);
        conversations_ll = (LinearLayout) findViewById(R.id.conversations_linear_layout);
        books_ll = (LinearLayout) findViewById(R.id.books_linear_layout);

        phrases_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_module();
            }
        });
    }

    void open_settings(){
        Intent intent = new Intent(this, Settings.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    void open_module(){
        Intent intent = new Intent(this, Module.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}