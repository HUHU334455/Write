package com.example.administrator.myapplx01;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Button button=(Button)findViewById(R.id.button);
        Drawable left=getResources().getDrawable(R.drawable.a_1,null);
        left.setBounds(0,0,left.getIntrinsicWidth()*3,left.getIntrinsicHeight()*3);
        button.setCompoundDrawables(left,null,null,null);
        Button button2=(Button)findViewById(R.id.button2);
        Drawable left2=getResources().getDrawable(R.drawable.a_2,null);
        left.setBounds(0,0,left2.getIntrinsicWidth()/3,left2.getIntrinsicHeight()/3);
        button2.setCompoundDrawables(left2,null,null,null);
        Button button3=(Button)findViewById(R.id.button3);
        Drawable left3=getResources().getDrawable(R.drawable.a_3,null);
        left3.setBounds(0,0,left3.getIntrinsicWidth(),left3.getIntrinsicHeight());
        button3.setCompoundDrawables(left3,null,null,null);
        Button button4=(Button)findViewById(R.id.button4);
        Drawable left4=getResources().getDrawable(R.drawable.a_4,null);
        left4.setBounds(0,0,left4.getIntrinsicWidth()/9,left.getIntrinsicHeight()/4);
        button4.setCompoundDrawables(left4,null,null,null);
        Button button5=(Button)findViewById(R.id.button5);
        Drawable left5=getResources().getDrawable(R.drawable.c_14,null);
        left5.setBounds(0,0,left5.getIntrinsicWidth()/5,left5.getIntrinsicHeight()/5);
        button5.setCompoundDrawables(left5,null,null,null);

    }
}
