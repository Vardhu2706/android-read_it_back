package com.mirai.readitback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {

    private ImageButton back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Linking image buttons
        back_button = (ImageButton) findViewById(R.id.back_image_button);

        // Adding button listeners
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling close setting function
                close_settings();
            }
        });
    }

    void close_settings(){
        onBackPressed();
    }
}