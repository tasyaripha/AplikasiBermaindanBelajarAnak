package com.example.aplikasibermaindanbelajaranak;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class membaca2 extends AppCompatActivity {
    private static final String isPlaying2 = "";

    /* renamed from: S */
    private Button f103S;

    /* renamed from: T */
    private Button f104T;

    /* renamed from: U */
    private Button f105U;

    /* renamed from: V */
    private Button f106V;

    /* renamed from: W */
    private Button f107W;

    /* renamed from: X */
    private Button f108X;

    /* renamed from: Y */
    private Button f109Y;

    /* renamed from: Z */
    private Button f110Z;
    private Button back2;
    private Button home2;
    public MediaPlayer player2;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.membaca2);
        getSupportActionBar().setTitle((CharSequence) "Belajar Membaca");
        getSupportActionBar().setSubtitle((CharSequence) "Huruf S-Z");
        this.back2 = (Button) findViewById(C0255R.C0257id.btBack2);
        this.home2 = (Button) findViewById(C0255R.C0257id.btAwal2);
        this.back2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca2.this.onBackPressed();
            }
        });
        this.home2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca2.this.startActivity(new Intent(membaca2.this, MainActivity.class));
            }
        });
    }
}
