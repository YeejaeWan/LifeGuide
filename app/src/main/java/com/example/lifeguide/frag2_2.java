package com.example.lifeguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class frag2_2 extends AppCompatActivity {
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag2_2);


        TextView title = findViewById(R.id.title1);
        TextView name = findViewById(R.id.name1);
        TextView t2 = findViewById(R.id.textView12);
        TextView t3 = findViewById(R.id.textView13);
        TextView t4 = findViewById(R.id.textView14);
        TextView t5 = findViewById(R.id.textView15);
        TextView t6 = findViewById(R.id.textView16);
        TextView t7 = findViewById(R.id.textView17);
        TextView t8 = findViewById(R.id.textView18);
        TextView t9 = findViewById(R.id.textView19);

        Intent intent = getIntent();
        profile_1 p1_1 = (profile_1) intent.getSerializableExtra("profile1");
        profile_2 p1_2 = (profile_2) intent.getSerializableExtra("profile2");

        title.setText(p1_2.getTitle());
        name.setText(p1_1.getName());
        t2.setText(p1_1.getComment());
        t3.setText(p1_1.getScore());
        t4.setText(p1_2.getS());
        t5.setText(p1_2.getActivity());
        t6.setText(p1_2.getType());
        t7.setText(p1_2.getH());
        t8.setText(p1_2.getJ());
        t9.setText(p1_2.getCost());

    }
}
