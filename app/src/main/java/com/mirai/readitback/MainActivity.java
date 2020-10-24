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
    private LinearLayout main_content;
    private RecyclerView content_view;

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
        content_view = (RecyclerView) findViewById(R.id.content_recyclerview);

        main_content = (LinearLayout) findViewById(R.id.main_content_ll);
        main_content.setOnClickListener(new View.OnClickListener() {
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