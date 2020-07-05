package com.example.aplikasibermaindanbelajaranak;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menghitung extends AppCompatActivity {
    private static final String isPlaying = "";
    MediaPlayer audioBackground;
    private Button back;
    private Button delapan;
    private Button dua;
    private Button empat;
    private Button enam;
    private Button lima;
    public MediaPlayer player;
    private Button satu;
    private Button sembilan;
    private Button sepuluh;
    private Button tiga;
    private Button tujuh;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.menghitung);
        getSupportActionBar().setTitle((CharSequence) "Belajar Berhitung");
        getSupportActionBar().setSubtitle((CharSequence) "Angka 0-9");
        this.back = (Button) findViewById(C0255R.C0257id.btBackHitung);
        this.audioBackground = MediaPlayer.create(this, C0255R.raw.bghitung);
        this.audioBackground.setLooping(false);
        this.audioBackground.setVolume(1.0f, 1.0f);
        this.audioBackground.start();
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                menghitung.this.onBackPressed();
                menghitung.this.audioBackground.stop();
            }
        });
        this.satu = (Button) findViewById(C0255R.C0257id.bt1);
        this.satu.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(1);
                menghitung.this.audioBackground.stop();
            }
        });
        this.dua = (Button) findViewById(C0255R.C0257id.bt2);
        this.dua.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(2);
                menghitung.this.audioBackground.stop();
            }
        });
        this.tiga = (Button) findViewById(C0255R.C0257id.bt3);
        this.tiga.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(3);
                menghitung.this.audioBackground.stop();
            }
        });
        this.empat = (Button) findViewById(C0255R.C0257id.bt4);
        this.empat.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(4);
                menghitung.this.audioBackground.stop();
            }
        });
        this.lima = (Button) findViewById(C0255R.C0257id.bt5);
        this.lima.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(5);
                menghitung.this.audioBackground.stop();
            }
        });
        this.enam = (Button) findViewById(C0255R.C0257id.bt6);
        this.enam.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(6);
                menghitung.this.audioBackground.stop();
            }
        });
        this.tujuh = (Button) findViewById(C0255R.C0257id.bt7);
        this.tujuh.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(7);
                menghitung.this.audioBackground.stop();
            }
        });
        this.delapan = (Button) findViewById(C0255R.C0257id.bt8);
        this.delapan.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(8);
                menghitung.this.audioBackground.stop();
            }
        });
        this.sembilan = (Button) findViewById(C0255R.C0257id.bt9);
        this.sembilan.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(9);
                menghitung.this.audioBackground.stop();
            }
        });
        this.sepuluh = (Button) findViewById(C0255R.C0257id.bt0);
        this.sepuluh.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                menghitung.this.playSound(10);
                menghitung.this.audioBackground.stop();
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
            Toast.makeText(this, " Angka Satu", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.satu);
        } else if (arg == 2) {
            Toast.makeText(this, " Angka Dua", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.dua);
        } else if (arg == 3) {
            Toast.makeText(this, " Angka Tiga", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.tiga);
        } else if (arg == 4) {
            Toast.makeText(this, " Angka Empat", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.empat);
        } else if (arg == 5) {
            Toast.makeText(this, " Angka Lima", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.lima);
        } else if (arg == 6) {
            Toast.makeText(this, " Angka Enam", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.enam);
        } else if (arg == 7) {
            Toast.makeText(this, " Angka Tujuh", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.tujuh);
        } else if (arg == 8) {
            Toast.makeText(this, " Angka Delapan", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.delapan);
        } else if (arg == 9) {
            Toast.makeText(this, " Angka Sembilan", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.sembilan);
        } else if (arg == 10) {
            Toast.makeText(this, " Angka Nol", 1).show();
            this.player = MediaPlayer.create(this, C0255R.raw.nol);
        }
        this.player.setLooping(false);
        this.player.start();
    }
}