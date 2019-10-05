package org.techtown.audio.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton rbnuga, rboreao, rbpie;
    Button endbtn, rebtn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1=(TextView) findViewById(R.id.srttxt);
        text2=(TextView) findViewById(R.id.question);

        switchAgree=(Switch) findViewById(R.id.srtswitch);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rbnuga=(RadioButton) findViewById(R.id.nuga);
        rboreao=(RadioButton) findViewById(R.id.oreao);
        rbpie=(RadioButton) findViewById(R.id.pie);

        endbtn=(Button) findViewById(R.id.endbtn);
        rebtn=(Button) findViewById(R.id.resrtbtn);

        img=(ImageView) findViewById(R.id.imgView);

        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isOn) {
                if (isOn) {
                    rGroup1.setVisibility(View.VISIBLE);
                    rbnuga.setVisibility(View.VISIBLE);
                    rboreao.setVisibility(View.VISIBLE);
                    rbpie.setVisibility(View.VISIBLE);
                    endbtn.setVisibility(View.VISIBLE);
                    rebtn.setVisibility(View.VISIBLE);
                }
                else{
                    rGroup1.setVisibility(View.INVISIBLE);
                    rbnuga.setVisibility(View.INVISIBLE);
                    rboreao.setVisibility(View.INVISIBLE);
                    rbpie.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    endbtn.setVisibility(View.INVISIBLE);
                    rebtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        rbnuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.nuga7);
                img.setVisibility(View.VISIBLE);
            }
        });

        rboreao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.oreo8);
                img.setVisibility(View.VISIBLE);
            }
        });

        rbpie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.pie9);
                img.setVisibility(View.VISIBLE);
            }
        });

        endbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        rebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchAgree.setChecked(false);
            }
        });
    }
}
