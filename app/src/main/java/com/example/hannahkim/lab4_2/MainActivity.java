package com.example.hannahkim.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button openBtn;
    Button closeBtn;
    LinearLayout layout1;
    LinearLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* allocate all the views */
        openBtn = (Button)findViewById(R.id.openBtn);
        closeBtn = (Button)findViewById(R.id.closeBtn);
        layout1 = (LinearLayout)findViewById(R.id.layout1);
        layout2 = (LinearLayout)findViewById(R.id.layout2);


        openBtn.setOnClickListener(new View.OnClickListener() { //if you press OPEN PAGE button
            public void onClick(View view) {
                /* start animation of the layout */
                layout2.setVisibility(View.VISIBLE);  //make the animation layout visible first!
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.right_slide);
                layout2.startAnimation(anim);
            }
        });

        closeBtn.setOnClickListener(new View.OnClickListener() { //if you press CLOSE PAGE button
            public void onClick(View view) {
                /* start animation */
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.left_slide);
                layout2.startAnimation(anim);
                layout2.setVisibility(View.GONE); //make the animated layout disappear after the animation!
            }
        });
    }
}
