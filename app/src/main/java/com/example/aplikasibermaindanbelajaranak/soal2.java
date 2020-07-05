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

public class soal2 extends AppCompatActivity {
    private static final String isPlaying1 = "";

    /* renamed from: A1 */
    private Button f114A1;

    /* renamed from: B1 */
    private Button f115B1;

    /* renamed from: C1 */
    private Button f116C1;
    private Button back1;
    private Button next1;
    public MediaPlayer player1;
    private Button soal1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.soal2);
        getSupportActionBar().setTitle((CharSequence) "Waktunya Bermain");
        getSupportActionBar().setSubtitle((CharSequence) "Soal 2");
        this.back1 = (Button) findViewById(C0255R.C0257id.btBackSoal1);
        this.next1 = (Button) findViewById(C0255R.C0257id.btNextSoal1);
        this.back1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soal2.this.onBackPressed();
            }
        });
        this.soal1 = (Button) findViewById(C0255R.C0257id.btSoal1);
        this.soal1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal2.this.playSound(1);
            }
        });
        this.f114A1 = (Button) findViewById(C0255R.C0257id.jwbA1);
        this.f114A1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal2.this.playSound(2);
            }
        });
        this.f115B1 = (Button) findViewById(C0255R.C0257id.jwbB1);
        this.f115B1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal2.this.playSound(3);
            }
        });
        this.f116C1 = (Button) findViewById(C0255R.C0257id.jwbC1);
        this.f116C1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal2.this.playSound(4);
            }
        });
    }

    public void onPause() {
        try {
            super.onPause();
            this.player1.pause();
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    public void playSound(int arg) {
        try {
            if (this.player1.isPlaying()) {
                this.player1.stop();
                this.player1.release();
            }
        } catch (Exception e) {
        }
        if (arg == 1) {
            Toast.makeText(this, " SOAL", 1).show();
            this.player1 = MediaPlayer.create(this, C0255R.raw.soaldua);
        } else if (arg == 2) {
            Toast.makeText(this, " Jawaban A", 1).show();
            this.player1 = MediaPlayer.create(this, C0255R.raw.salahlagi);
        } else if (arg == 3) {
            Toast.makeText(this, " Jawaban B", 1).show();
            this.player1 = MediaPlayer.create(this, C0255R.raw.salah);
        } else if (arg == 4) {
            Toast.makeText(this, " Jawaban C", 1).show();
            this.player1 = MediaPlayer.create(this, C0255R.raw.benarsatu);
            this.next1.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    soal2.this.startActivity(new Intent(soal2.this, soal3.class));
                }
            });
        }
        this.player1.setLooping(false);
        this.player1.start();
    }
}
