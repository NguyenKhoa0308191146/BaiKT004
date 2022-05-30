package com.example.nguyenkhoa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterThongbao extends ArrayAdapter<Thongtin> {
    Context context;
    int res;
    ArrayList<Thongtin> thongtin;

    public AdapterThongbao(@NonNull Context context, int resource, @NonNull ArrayList<Thongtin> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.thongtin = objects;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_thongbao, parent, false);
        TextView ngay = convertView.findViewById(R.id.ngay);
        TextView tieude = convertView.findViewById(R.id.tieude);
        ImageButton img = convertView.findViewById(R.id.img);
        Thongtin tt = thongtin.get(position);
        String ngays = tt.getNgay();
        ngay.setText(ngays);
        String tieudes = tt.getTieude();
        tieude.setText(tieudes);
        int anh = tt.getImg();
        img.setImageResource(anh);
        return convertView;
    }
}
