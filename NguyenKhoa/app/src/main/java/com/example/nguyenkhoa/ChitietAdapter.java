package com.example.nguyenkhoa;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChitietAdapter extends AppCompatActivity {
    public final static String EXTRA_POSITION = "positon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitiet_caothang);
    }
}

