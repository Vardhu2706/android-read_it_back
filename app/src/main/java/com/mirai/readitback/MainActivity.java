package com.mirai.readitback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settings = (ImageButton) findViewById(R.id.settings_image_button);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                open_settings();
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