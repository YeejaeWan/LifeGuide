package com.example.lifeguide;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class Frag1 extends Fragment {

    private ViewPager2 sliderViewPager;
    private LinearLayout layoutIndicator;
    private Context context;

    private String[] images = new String[] {
            "https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/02/17/19/08/lotus-1205631_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/08/20/15/47/poppies-174276_1280.jpg",
            "https://cdn.pixabay.com/photo/2023/07/28/15/14/wall-8155414_1280.jpg",
            "https://cdn.pixabay.com/photo/2023/08/02/14/56/animal-8165466_1280.jpg"
    };

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);
        sliderViewPager = view.findViewById(R.id.sliderViewPager);
        layoutIndicator = view.findViewById(R.id.layoutIndicators);

        sliderViewPager.setOffscreenPageLimit(1);
        sliderViewPager.setAdapter(new ImageSliderAdapter(context, images));

        sliderViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                setCurrentIndicator(position);
            }
        });

        setupIndicators(images.length);
        return view;
    }

    private void setupIndicators(int count) {
        ImageView[] indicators = new ImageView[count];
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        params.setMargins(16, 8, 16, 8);

        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(context);
            indicators[i].setImageDrawable(ContextCompat.getDrawable(context,
                    R.drawable.bg_indicator_inactive));
            indicators[i].setLayoutParams(params);
            layoutIndicator.addView(indicators[i]);
        }
        setCurrentIndicator(0);
    }

    private void setCurrentIndicator(int position) {
        int childCount = layoutIndicator.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView) layoutIndicator.getChildAt(i);
            if (i == position) {
                imageView.setImageDrawable(ContextCompat.getDrawable(
                        context,
                        R.drawable.bg_indicator_active
                ));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(
                        context,
                        R.drawable.bg_indicator_inactive
                ));
            }
        }
    }

}
