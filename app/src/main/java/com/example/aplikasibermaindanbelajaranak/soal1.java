package com.example.aplikasibermaindanbelajaranak;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class soal1 extends AppCompatActivity {
    private static final String isPlaying = "";

    /* renamed from: A */
    private Button f111A;

    /* renamed from: B */
    private Button f112B;

    /* renamed from: C */
    private Button f113C;
    private Button back;
    private Button next;
    public MediaPlayer player;
    private Button soal;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.soal1);
        getSupportActionBar().setTitle((CharSequence) "Waktunya Bermain");
        getSupportActionBar().setSubtitle((CharSequence) "Soal 1");
        this.back = (Button) findViewById(C0255R.C0257id.btBackSoal);
        this.next = (Button) findViewById(C0255R.C0257id.btNextSoal);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soal1.this.onBackPressed();
            }
        });
        this.soal = (Button) findViewById(C0255R.C0257id.btSoal);
        this.soal.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal1.this.playSound(1);
            }
        });
        this.f111A = (Button) findViewById(C0255R.C0257id.jwbA);
        this.f111A.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal1.this.playSound(2);
            }
        });
        this.f112B = (Button) findViewById(C0255R.C0257id.jwbB);
        this.f112B.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal1.this.playSound(3);
            }
        });
        this.f113C = (Button) findViewById(C0255R.C0257id.jwbC);
        this.f113C.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal1.this.playSound(4);
            }
        });
    }

    public void onPause() {
        try {
            super.onPause();
            this.player.pause();
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    public void playSound(int arg) {
        try {
            if (this.player.isPlaying()) {
                this.player.stop();
                this.player.release();
            }
        } catch (Exception e) {
        }
        if (arg == 1) {
            Toast.makeText(this, " SOAL", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.soalsatu);
        } else if (arg == 2) {
            Toast.makeText(this, " Jawaban A", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.benarsatu);
            this.next.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    soal1.this.startActivity(new Intent(soal1.this, soal2.class));
                }
            });
        } else if (arg == 3) {
            Toast.makeText(this, " Jawaban B", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.salah);
        } else if (arg == 4) {
            Toast.makeText(this, " Jawaban C", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.salahlagi);
        }
        this.player.setLooping(false);
        this.player.start();
    }
}
