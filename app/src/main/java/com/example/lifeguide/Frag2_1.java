package com.example.lifeguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Frag2_1 extends AppCompatActivity {
    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag2_1);

        TextView title = findViewById(R.id.title);
        TextView name = findViewById(R.id.name);
        TextView t2 = findViewById(R.id.textView2);
        TextView t3 = findViewById(R.id.textView3);
        TextView t4 = findViewById(R.id.textView4);
        TextView t5 = findViewById(R.id.textView5);
        TextView t6 = findViewById(R.id.textView6);
        TextView t7 = findViewById(R.id.textView7);
        TextView t8 = findViewById(R.id.textView8);

//        getIntent() 메서드는 Activity 클래스의 메서드이기 때문에 Fragment에서 직접 사용할 수 없습니다.
//        Fragment에서는 getActivity() 메서드를 사용하여 해당 Fragment가 속한 Activity에 접근할 수 있습니다.
//        따라서 getIntent() 대신 getActivity().getIntent()를 사용해야 합니다.
//fragment로 하려했는데 오류나서 그냥 appcomp~로 했어요
        Intent intent = getIntent(); /*데이터 수신*/

        profile_1 p1_1 = (profile_1) intent.getSerializableExtra("profile1"); /*클래스*/
        profile_2 p1_2 = (profile_2) intent.getSerializableExtra("profile2"); /*클래스*/

        title.setText(p1_2.getTitle());

        name.setText(p1_1.getName());
        t2.setText(p1_1.getComment());
        t3.setText(p1_1.getScore());
        t4.setText(p1_2.getS());
        t5.setText(p1_2.getActivity());
        t6.setText(p1_2.getType());
        t7.setText(p1_2.getH());
        t8.setText(p1_2.getCost());
    }

}
