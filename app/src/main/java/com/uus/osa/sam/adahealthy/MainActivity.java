package com.uus.osa.sam.adahealthy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.uus.osa.sam.adahealthy.Fragment.IntroductionFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setAnim();
//
//        FrameLayout fragmentLayout = new FrameLayout(this);
//
//        fragmentLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//
//        fragmentLayout.setId(R.id.fragmentLayout);
//
//        setContentView(fragmentLayout);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new IntroductionFragment()).commit();

    }
}
