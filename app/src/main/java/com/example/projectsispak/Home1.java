package com.example.projectsispak;


import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class Home1 extends Fragment {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.koceng,"Sampah A","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah B","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah C","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));
        models.add(new Model(R.drawable.koceng,"Sampah D","Penumpukan sampah yang berserakan ini sangat tidak " +
                "enak dipandang dikarenakan kurangnya kesadaran dari masyrakat setempat membuat sampah tersebut menjadi menggunung"));

        adapter = new Adapter(models,getActivity());

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(300,0,130,0);
//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.color1),
//                getResources().getColor(R.color.color2),
//                getResources().getColor(R.color.color3),
//                getResources().getColor(R.color.color4)
//        };
//        colors = colors_temp;
//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                if(position<(adapter.getCount() - 1) && position < (colors.length - 1)){
//                    viewPager.setBackgroundColor(
//                            (Integer) argbEvaluator.evaluate(positionOffset, colors[position], colors[position+1])
//                    );
//                }else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });





        return view;
    }

}
