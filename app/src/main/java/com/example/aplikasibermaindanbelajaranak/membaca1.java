package com.example.aplikasibermaindanbelajaranak;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class membaca1 extends AppCompatActivity {
    private static final String isPlaying1 = "";

    /* renamed from: J */
    private Button f94J;

    /* renamed from: K */
    private Button f95K;

    /* renamed from: L */
    private Button f96L;

    /* renamed from: M */
    private Button f97M;

    /* renamed from: N */
    private Button f98N;

    /* renamed from: O */
    private Button f99O;

    /* renamed from: P */
    private Button f100P;

    /* renamed from: Q */
    private Button f101Q;
    private Button baca1;
    private Button back1;
    private Button home1;
    public MediaPlayer player1;

    /* renamed from: r */
    private Button f102r;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.membaca1);
        getSupportActionBar().setTitle((CharSequence) "Belajar Membaca");
        getSupportActionBar().setSubtitle((CharSequence) "Huruf J-R");
        this.back1 = (Button) findViewById(C0255R.C0257id.btBack1);
        this.baca1 = (Button) findViewById(C0255R.C0257id.btNext1);
        this.home1 = (Button) findViewById(C0255R.C0257id.btAwal1);
        this.back1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca1.this.onBackPressed();
            }
        });
        this.baca1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca1.this.startActivity(new Intent(membaca1.this, membaca2.class));
            }
        });
        this.home1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca1.this.startActivity(new Intent(membaca1.this, MainActivity.class));
            }
        });
    }
}
