package com.example.myapplicationfanjjoikesd;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class buah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
        TextView click1=(TextView)findViewById(R.id.button1);
        TextView click2=(TextView)findViewById(R.id.button2);
        TextView click3=(TextView)findViewById(R.id.button3);
        TextView click4=(TextView)findViewById(R.id.button4);
        TextView click5=(TextView)findViewById(R.id.button5);
        TextView click6=(TextView)findViewById(R.id.button6);

        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.banana);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.watermelon);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.orang);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.grape);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.jackfruit);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.apple);

        View.OnClickListener elem = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button1:
                        mp1.start();
                        break;
                    case R.id.button2:
                        mp2.start();
                        break;
                    case R.id.button3:
                        mp3.start();
                        break;
                    case R.id.button4:
                        mp4.start();
                        break;
                    case R.id.button5:
                        mp5.start();
                        break;
                    case R.id.button6:
                        mp6.start();
                        break;
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
        click6.setOnClickListener(elem);
    }
}