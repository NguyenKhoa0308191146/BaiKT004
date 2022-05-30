package com.example.nguyenkhoa;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main1Activity extends AppCompatActivity {
    ListView ListThongbao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        ListThongbao=findViewById(R.id.list_thong_bao);
        ArrayList<Thongtin> thongtin =new ArrayList<>();
        Thongtin thongtin1 = new Thongtin(R.drawable.solar_boat, "30/04/2022", "Solar Boat Challege 2022 - Khơi dậy niềm đam mê khoa học kỹ thuật");
        thongtin.add(thongtin1);
        Thongtin thongtin2 = new Thongtin(R.drawable.viec_lam, "29/04/2022", "Nhiều cơ hội việc làm dành cho sinh viên tốt nghiệp Trường Cao đẳng Kỹ thuật Cao Thắng");
        thongtin.add(thongtin2);
        Thongtin thongtin3 = new Thongtin(R.drawable.tieng_nhat, "20/04/2022", "Hội thảo “Học Tiếng Nhật – Cơ hội làm việc tại các doanh nghiệp Nhật Bản”");
        thongtin.add(thongtin3);
        AdapterThongbao adapterThongbao = new AdapterThongbao(Main1Activity.this,R.layout.listview_thongbao,thongtin);
        ListThongbao.setAdapter(adapterThongbao);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("THÔNG BÁO");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}
