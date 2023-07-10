package com.example.lifeguide;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.frag1:
                        setFrag(0);
                        break;
                    case R.id.frag2:
                        setFrag(1);
                        break;
                    case R.id.frag3:
                        setFrag(2);
                        break;
                    case R.id.frag4:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });


        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        frag4 = new Frag4();


        setFrag(0); //첫 프래그먼트 화면을 무엇으로 지정해줄 것인지 선택.

    }




    //프래그먼트 교체가 일어나는 실행문
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                if (frag1 == null) {
                    frag1 = new Frag1();
                }
                ft.replace(R.id.main_frame, frag1);
                break;
            case 1:
                if (frag2 == null) {
                    frag2 = new Frag2();
                }
                ft.replace(R.id.main_frame, frag2);
                break;
            case 2:
                if (frag3 == null) {
                    frag3 = new Frag3();
                }
                ft.replace(R.id.main_frame, frag3);
                break;
            case 3:
                if (frag4 == null) {
                    frag4 = new Frag4();
                }
                ft.replace(R.id.main_frame, frag4);
                break;
        }
        ft.commit();


    }





}