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

public class soal6 extends AppCompatActivity {
    private static final String isPlaying3 = "";

    /* renamed from: A3 */
    private Button f126A3;

    /* renamed from: B3 */
    private Button f127B3;

    /* renamed from: C3 */
    private Button f128C3;
    private Button back3;
    private Button next3;
    public MediaPlayer player3;
    private Button soal3;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.soal6);
        getSupportActionBar().setTitle((CharSequence) "Waktunya Bermain");
        getSupportActionBar().setSubtitle((CharSequence) "Soal Terakhir :)");
        this.back3 = (Button) findViewById(C0255R.C0257id.btBackSoal5);
        this.next3 = (Button) findViewById(C0255R.C0257id.btNextSoal5);
        this.back3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soal6.this.onBackPressed();
            }
        });
        this.soal3 = (Button) findViewById(C0255R.C0257id.btSoal5);
        this.soal3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal6.this.playSound(1);
            }
        });
        this.f126A3 = (Button) findViewById(C0255R.C0257id.jwbA5);
        this.f126A3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal6.this.playSound(2);
            }
        });
        this.f127B3 = (Button) findViewById(C0255R.C0257id.jwbB5);
        this.f127B3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal6.this.playSound(3);
            }
        });
        this.f128C3 = (Button) findViewById(C0255R.C0257id.jwbC5);
        this.f128C3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                soal6.this.playSound(4);
            }
        });
    }

    public void onPause() {
        try {
            super.onPause();
            this.player3.pause();
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: private */
    public void playSound(int arg) {
        try {
            if (this.player3.isPlaying()) {
                this.player3.stop();
                this.player3.release();
            }
        } catch (Exception e) {
        }
        if (arg == 1) {
            Toast.makeText(this, " SOAL", 1).show();
            this.player3 = MediaPlayer.create(this, C0255R.raw.soalenam);
        } else if (arg == 2) {
            Toast.makeText(this, " Jawaban A", 1).show();
            this.player3 = MediaPlayer.create(this, C0255R.raw.benarsatu);
            this.next3.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    soal6.this.startActivity(new Intent(soal6.this, MainActivity.class));
                }
            });
        } else if (arg == 3) {
            Toast.makeText(this, " Jawaban B", 1).show();
            this.player3 = MediaPlayer.create(this, C0255R.raw.salahlagi);
        } else if (arg == 4) {
            Toast.makeText(this, " Jawaban C", 1).show();
            this.player3 = MediaPlayer.create(this, C0255R.raw.salah);
        }
        this.player3.setLooping(false);
        this.player3.start();
    }
}
