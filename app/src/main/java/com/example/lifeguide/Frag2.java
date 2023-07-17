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

        profile_1 p1_1 = new profile_1(" 이재완 상담가"," 힘드신 일 있으면 숨기지 마시고 언제든지 말씀해주세요", " 평점: 4.5점");
        profile_2 p1_2 = new profile_2(" 멘토"," 남성"," 이재완 멘토는 연간 50회 이상의 상담을 진행하고 있습니다", " 직장 대인 관계 및 업무 스트레스",
                " 이메일, 화상채팅, 전화", " 1회 평균 10,000회(상담내용, 시간 별 변동 가능)");

        profile_1 p2_1 = new profile_1(" 김유진 상담가"," 모든 고민과 걱정은 저에게 다 놓고 가세요", " 평점: 4.9점");
        profile_2 p2_2 = new profile_2(" 멘토"," 여성"," 김유진 멘토는 연간 1000회 이상의 상담을 진행하고 있습니다", " 업무 스트레스","전화",
                " 1회에 평균 10,000");

        profile_1 p3_1 = new profile_1(" 이찬규 상담사"," 연락처: 02-0000-0000"," 이메일:counselee@lifeguide.com");
        profile_2 p3_2 = new profile_2(" 전문 상담사", " 남성", " 청소년, 아동 심리 상담"," 00병원 심리상담센터 운영\n000학교 전문 심리상담사"," 화상 채팅"," 청소년 상담사 2급\n임상 심리사 2급",
                " 1회에 평균 50,000(상담 내용, 시간 별 변동 가능)");

        profile_1 p4_1 = new profile_1(" 임종호 상담사", " 연락처: 041-0000-0000"," 이메일: coun@lifequid.com");
        profile_2 p4_2 = new profile_2(" 전문 상담사", " 남성", " 청소년, 성인 심리 상담", " 00병원 청소년심리상담센터 운영"," 면담"," 청소년 상담사 1급\n임상 심리사 1급",
                " 1회에 평균 80,000(상담 내용, 시간 별 변동 가능)");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Frag2_1.class);
                intent.putExtra("profile1", p1_1);
                intent.putExtra("profile2", p1_2);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Frag2_1.class);
                intent.putExtra("profile1", p2_1);
                intent.putExtra("profile2", p2_2);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Frag2_2.class);
                intent.putExtra("profile1", p3_1);
                intent.putExtra("profile2", p3_2);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Frag2_2.class);
                intent.putExtra("profile1", p4_1);
                intent.putExtra("profile2", p4_2);
                startActivity(intent);
            }
        });
        return view;
    }
}
