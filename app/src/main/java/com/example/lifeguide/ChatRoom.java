package com.example.lifeguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ChatRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_room);

        ImageView image1 = (ImageView)findViewById(R.id.image1);
        image1.setImageResource(R.drawable.profile);

        ImageView image3 = (ImageView)findViewById(R.id.image3);
        image3.setImageResource(R.drawable.profile);

    }

}