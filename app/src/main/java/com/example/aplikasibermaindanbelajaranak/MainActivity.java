package com.example.aplikasibermaindanbelajaranak;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audioBackground;
    private Button baca;
    private Button game;
    private Button hitung;
    private Button info;
    private Button keluar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.activity_main);
        getSupportActionBar().setTitle((CharSequence) "Pengenalan Huruf, Angka & Game");
        getSupportActionBar().setSubtitle((CharSequence) "Kelompok 2");
        this.baca = (Button) findViewById(C0255R.C0257id.btMembaca);
        this.hitung = (Button) findViewById(C0255R.C0257id.btMenghitung);
        this.game = (Button) findViewById(C0255R.C0257id.btBermain);
        this.keluar = (Button) findViewById(C0255R.C0257id.btKeluar);
        this.info = (Button) findViewById(C0255R.C0257id.btInfo);
        this.audioBackground = MediaPlayer.create(this, C0255R.raw.game);
        this.audioBackground.setLooping(true);
        this.audioBackground.setVolume(1.0f, 1.0f);
        this.audioBackground.start();
        this.baca.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, membaca.class));
                MainActivity.this.audioBackground.stop();
            }
        });
        this.hitung.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, menghitung.class));
                MainActivity.this.audioBackground.stop();
            }
        });
        this.game.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, soal1.class));
                MainActivity.this.audioBackground.stop();
            }
        });
        this.info.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, info.class));
            }
        });
        this.keluar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.moveTaskToBack(true);
                MainActivity.this.audioBackground.stop();
            }
        });
    }
}
