package com.example.nguyenkhoa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView listdanhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LỊCH HỌC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_view_headline_24);

        listdanhsach=findViewById(R.id.list_danh_sach);
        ArrayList<Danhsach> danhsach =new ArrayList<>();
        Danhsach danhsach1 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20A","CA 1",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach1);
        Danhsach danhsach2 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20A","CA 2",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach2);
        Danhsach danhsach3 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20A","CA 3",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach3);
        Danhsach danhsach4 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20B","CA 1",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach4);
        Danhsach danhsach5 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20B","CA 2",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach5);
        Danhsach danhsach6 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 20B","CA 3",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach6);
        Danhsach danhsach7 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21A","CA 1",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach7);
        Danhsach danhsach8 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21A","CA 2",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach8);
        Danhsach danhsach9 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21A","CA 3",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach9);
        Danhsach danhsach10 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21B","CA 1",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach10);
        Danhsach danhsach11 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21B","CA 2",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach11);
        Danhsach danhsach12 = new Danhsach(R.drawable.caothang,"CĐ ĐTTT 21B","CA 3",R.drawable.ic_baseline_chevron_right_24);
        danhsach.add(danhsach12);
        AdapterDanhSach adapterDanhSach =new AdapterDanhSach(MainActivity.this,R.layout.listview_caothang,danhsach);
        listdanhsach.setAdapter(adapterDanhSach);
        listdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ChitietAdapter.class);
                intent.putExtra(ChitietAdapter.EXTRA_POSITION, position);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                Toast.makeText(this,"Bạn vừa bấm menu", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu1:
                openActivity1();
                break;
            case R.id.menu2:
                openActivity2();
                break;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openActivity2() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    private void openActivity1() {
        intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }

}