package com.example.nguyenkhoa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterDanhSach extends ArrayAdapter<Danhsach> {
    Context context;
    int res;
    ArrayList<Danhsach> danhsach;

    public AdapterDanhSach(@NonNull Context context, int resource, @NonNull ArrayList<Danhsach> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.danhsach = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_caothang, parent, false);
        TextView ten = convertView.findViewById(R.id.ten);
        TextView ca = convertView.findViewById(R.id.ca);
        ImageView logo = convertView.findViewById(R.id.logo);
        ImageButton icon = convertView.findViewById(R.id.icon);
        Danhsach ds = danhsach.get(position);
        String cahs = ds.getCa();
        ca.setText(cahs);
        String name = ds.getTen();
        ten.setText(name);
        int caothang = ds.getLogo();
        logo.setImageResource(caothang);
        int button = ds.getIcon();
        icon.setImageResource(button);
        return convertView;
    }
}
