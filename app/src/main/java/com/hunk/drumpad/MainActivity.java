package com.hunk.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SoundPool sp;
    private int Sound1;
    private int Sound2;
    private int Sound3;
    private int Sound4;
    private int Sound5;
    private int Sound6;

    Button Button1 , Button2 , Button3, Button4, Button5, Button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,1);

        Sound1 = sp.load(getApplicationContext(),R.raw.fx1,1);
        Sound2 = sp.load(getApplicationContext(),R.raw.fx2,1);
        Sound3 = sp.load(getApplicationContext(),R.raw.fx3,1);
        Sound4 = sp.load(getApplicationContext(),R.raw.fx4,1);
        Sound5 = sp.load(getApplicationContext(),R.raw.fx5,1);
        Sound6 = sp.load(getApplicationContext(),R.raw.fx6,1);

        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound1,1.0f,1.0f,0,0,1f);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound2,1.0f,1.0f,0,0,1f);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound3,1.0f,1.0f,0,0,1f);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound4,1.0f,1.0f,0,0,1f);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound5,1.0f,1.0f,0,0,1f);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sp.play(Sound6,1.0f,1.0f,0,0,1f);
            }
        });
    }
}
