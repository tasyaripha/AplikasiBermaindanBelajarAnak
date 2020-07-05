package com.example.aplikasibermaindanbelajaranak;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class info extends AppCompatActivity {
    private Button back;

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0255R.layout.info);
        getSupportActionBar().setTitle((CharSequence) "Info Aplikasi");
        getSupportActionBar().setSubtitle((CharSequence) "Tugas Akhir");
        this.back = (Button) findViewById(C0255R.C0257id.btBackInfo);
        this.back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                info.this.onBackPressed();
            }
        });
    }
}
