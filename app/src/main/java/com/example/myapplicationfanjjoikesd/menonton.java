package com.example.myapplicationfanjjoikesd;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

@SuppressLint("SetTextI18n")
public class menonton extends YouTubeBaseActivity {
    private static final String API_KEY = "AIzaSyAXZuTQ9LD1THMCNRmQV5RRPazjn6NCK-E";
    private YouTubePlayer player;
    private TextView textPlay;
    private LinearLayout layoutPlay, layoutVideoList;
    private String videoKeySelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menonton);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtubePlayer);
        textPlay = findViewById(R.id.textPlay);
        layoutVideoList = findViewById(R.id.layoutVideoList);
        layoutPlay = findViewById(R.id.layoutPlay);
        TextView textChooseVideo = findViewById(R.id.textChooseVideo);


        youTubePlayerView.initialize(API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                player = youTubePlayer;
                layoutPlay.setVisibility(View.VISIBLE);
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(), "Failed to initialize. Please check something!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        setVideoList();

        textChooseVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutVideoList.setVisibility(View.VISIBLE);
            }
        });
        textPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(videoKeySelected)) {
                    Toast.makeText(getApplicationContext(), "Pilih video untuk dimainkan",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                if (player.isPlaying()) {
                    player.pause();
                }
                player.loadVideo(videoKeySelected);
            }
        });
    }

    private final String [] videosKey = {"7YPaiOolF1g", "XqZsoesa55w", "rZraTZ-Fl_o", "ZPcZHXrKA7U",
            "o_t7lC_cjVc", "ThM0EdT1ByU", "bIg3j266IL8", "ufbe75bUZJs"};

    private void setVideoList() {
        for (int i = 0; i < 8; i++) {
            TextView textVideo = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 10, 0, 10);
            textVideo.setLayoutParams(params);
            textVideo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textVideo.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            textVideo.setPadding(0, 5, 0, 5);
            layoutVideoList.addView(textVideo);
        }

        TextView textVideo1 = (TextView) layoutVideoList.getChildAt(0);
        TextView textVideo2 = (TextView) layoutVideoList.getChildAt(1);
        TextView textVideo3 = (TextView) layoutVideoList.getChildAt(2);
        TextView textVideo4 = (TextView) layoutVideoList.getChildAt(3);
        TextView textVideo5 = (TextView) layoutVideoList.getChildAt(4);
        TextView textVideo6 = (TextView) layoutVideoList.getChildAt(5);
        TextView textVideo7 = (TextView) layoutVideoList.getChildAt(6);
        TextView textVideo8 = (TextView) layoutVideoList.getChildAt(7);



        textVideo1.setText("Cicak Cicak di Dinding - Lagu Anak Indonesia Populer");
        textVideo2.setText("Baby Shark Dance | Menyanyi dan Dance! | Lagu hewan | PINKFONG Lagu untuk Anak-anak");
        textVideo3.setText("Naik Delman - Lagu Anak Indonesia");
        textVideo4.setText("Yes Yes Playground Song | Lellobee by CoComelon");
        textVideo5.setText("Wheels on the Bus V2 (Play Version) | Lellobee by CoComelon");
        textVideo6.setText("Tayo Lagu Pembukaan Tema Kompilasi l lagu untuk anak-anak");
        textVideo7.setText("Naik Kereta Api Tut Tut - Lagu Anak Indonesia");
        textVideo8.setText("Kring Kring Ada Sepeda - Lagu Anak Indonesia ");


        //menentukan klik listener untuk ke-10 Textview
        onTextVideoClicked(textVideo1, videosKey[0]);
        onTextVideoClicked(textVideo2, videosKey[1]);
        onTextVideoClicked(textVideo3, videosKey[2]);
        onTextVideoClicked(textVideo4, videosKey[3]);
        onTextVideoClicked(textVideo5, videosKey[4]);
        onTextVideoClicked(textVideo6, videosKey[5]);
        onTextVideoClicked(textVideo7, videosKey[6]);
        onTextVideoClicked(textVideo8, videosKey[7]);

    }

    //Metode klik untuk ke-10 Textview yang dibuat menggunakan loop diatas
    private void onTextVideoClicked(final TextView textVideo, final String videoKey) {
        textVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutVideoList.setVisibility(View.GONE);
                videoKeySelected = videoKey;
                textPlay.setText("Play " + textVideo.getText().toString());
            }
        });
    }
}