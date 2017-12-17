package com.example.win7.belajarbindoxi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class MateriAdapter extends BaseAdapter{
    ArrayList listItem;
    Activity activity;

    public MateriAdapter(Activity activity,ArrayList listItem){
        this.activity = activity;
        this.listItem = listItem;
    }
    @Override
    public int getCount(){
        return listItem.size();
    }
    @Override
    public Object getItem(int position){
        return listItem.get(position);
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view = convertView;
        ViewHolder holder = null;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item,null);
            holder.txtTittle= (TextView)view.findViewById(R.id.txt_tittle);
            holder.txtJudul= (TextView)view.findViewById(R.id.txt_judul);
            holder.txtisi = (TextView)view.findViewById(R.id.txt_isi);
            holder.txtisi2 = (TextView)view.findViewById(R.id.txt_isi2);
            holder.imgItem = (ImageView)view.findViewById(R.id.img_item);
            view.setTag(holder);
        }else{
            holder= (ViewHolder)view.getTag();
        }
        ModelMateri materi = (ModelMateri)getItem(position);
        holder.txtTittle.setText(materi.getTittle());
        holder.txtJudul.setText(materi.getJudul());
        holder.txtisi.setText(materi.getIsi());
        holder.txtisi2.setText(materi.getIsi2());

        Picasso.with(activity).load(materi.getImage()).into(holder.imgItem);
        return view;

    }
    static class ViewHolder {
        ImageView imgItem;
        TextView txtTittle, txtJudul, txtisi, txtisi2;
    }
}
