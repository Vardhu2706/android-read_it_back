package com.mirai.readitback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Options extends AppCompatActivity {

    private ImageButton back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        // Linking buttons
        back_button = (ImageButton) findViewById(R.id.back_image_button);

        // Setting onclick
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                close_options();
            }
        });
    }

    void close_options(){
        onBackPressed();
    }
}