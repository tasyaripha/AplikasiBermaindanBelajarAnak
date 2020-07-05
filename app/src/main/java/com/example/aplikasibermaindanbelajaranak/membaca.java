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

public class membaca extends AppCompatActivity {
    private static final String isPlaying = "";

    /* renamed from: A */
    private Button f85A;

    /* renamed from: B */
    private Button f86B;

    /* renamed from: C */
    private Button f87C;

    /* renamed from: D */
    private Button f88D;

    /* renamed from: E */
    private Button f89E;

    /* renamed from: F */
    private Button f90F;

    /* renamed from: G */
    private Button f91G;

    /* renamed from: H */
    private Button f92H;

    /* renamed from: I */
    private Button f93I;
    private Button baca;
    private Button back;
    public MediaPlayer player;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.membaca);
        getSupportActionBar().setTitle((CharSequence) "Belajar Membaca");
        getSupportActionBar().setSubtitle((CharSequence) "Huruf A-I");
        this.back = (Button) findViewById(C0255R.C0257id.btBack);
        this.baca = (Button) findViewById(C0255R.C0257id.btNext);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca.this.onBackPressed();
            }
        });
        this.baca.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                membaca.this.startActivity(new Intent(membaca.this, membaca1.class));
            }
        });
        this.f85A = (Button) findViewById(C0255R.C0257id.btA);
        this.f85A.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(1);
            }
        });
        this.f86B = (Button) findViewById(C0255R.C0257id.btB);
        this.f86B.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(2);
            }
        });
        this.f87C = (Button) findViewById(C0255R.C0257id.btC);
        this.f87C.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(3);
            }
        });
        this.f88D = (Button) findViewById(C0255R.C0257id.btD);
        this.f88D.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(4);
            }
        });
        this.f89E = (Button) findViewById(C0255R.C0257id.btE);
        this.f89E.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(5);
            }
        });
        this.f90F = (Button) findViewById(C0255R.C0257id.btF);
        this.f90F.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(6);
            }
        });
        this.f91G = (Button) findViewById(C0255R.C0257id.btG);
        this.f91G.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(7);
            }
        });
        this.f92H = (Button) findViewById(C0255R.C0257id.btH);
        this.f92H.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(8);
            }
        });
        this.f93I = (Button) findViewById(C0255R.C0257id.btI);
        this.f93I.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                membaca.this.playSound(9);
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
            Toast.makeText(this, " Huruf A", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f59a);
        } else if (arg == 2) {
            Toast.makeText(this, " Huruf B", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f60b);
        } else if (arg == 3) {
            Toast.makeText(this, " Huruf C", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f61c);
        } else if (arg == 4) {
            Toast.makeText(this, " Huruf D", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f62d);
        } else if (arg == 5) {
            Toast.makeText(this, " Huruf E", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f63e);
        } else if (arg == 6) {
            Toast.makeText(this, " Huruf F", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f64f);
        } else if (arg == 7) {
            Toast.makeText(this, " Huruf G", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f65g);
        } else if (arg == 8) {
            Toast.makeText(this, " Huruf H", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f66h);
        } else if (arg == 9) {
            Toast.makeText(this, " Huruf I", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.f67i);
        }
        this.player.setLooping(false);
        this.player.start();
    }
}
