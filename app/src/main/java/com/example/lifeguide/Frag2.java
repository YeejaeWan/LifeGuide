package com.example.lifeguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lifeguide.frag2_2;
import com.example.lifeguide.profile_1;
import com.example.lifeguide.profile_2;
import java.io.Serializable;

public class Frag2 extends Fragment {
    Button button2;
    Button button3;
    Button button8;
    Button button9;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);

        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);

        profile_1 p1_1 = new profile_1("이재완 상담가","힘드신 일 있으면 숨기지 마시고 언제든지 말씀해주세요", "평점: 4.5점");
        profile_2 p1_2 = new profile_2("멘토","남성","이재완 멘토는 연간 50회 이상의 상담을 진행하고 있습니다", "직장 대인 관계 및 업무 스트레스",
                "이메일, 화상채팅, 전화", "1회 평균 10,000회(상담내용, 시간 별 변동 가능)");

        profile_1 p2_1 = new profile_1("김유진 상담가","모든 고민과 걱정은 저에게 다 놓고 가세요", "평점: 4.9점");
        profile_2 p2_2 = new profile_2("멘토","여성","김유진 멘토는 연간 1000회 이상의 상담을 진행하고 있습니다", "업무 스트레스","전화",
                "1회에 평균 2,000");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), frag2_2.class);
                intent.putExtra("profile1", p1_1);
                intent.putExtra("profile2", p1_2);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), frag2_2.class);
                intent.putExtra("profile1", p2_1);
                intent.putExtra("profile2", p2_2);
                startActivity(intent);
            }
        });

        return view;
    }
}
