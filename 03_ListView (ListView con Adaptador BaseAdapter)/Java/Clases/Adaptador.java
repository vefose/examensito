package com.example.listview;

import android.widget.*;
import android.view.*;
import android.content.Context;
public class Adaptador extends BaseAdapter {
    Context contexto;
    String[] listadeportes;
    String[] listacomentar ;
    int[] listaimagenes;
    LayoutInflater inflater;
    public Adaptador (Context contexto,String [] listadeportes, String[] listacomentar, int [] listaimagenes){
        this.contexto = contexto;
        this.listadeportes = listacomentar;
        this.listacomentar = listacomentar;
        this.listaimagenes = listaimagenes;
        this.inflater = LayoutInflater.from(contexto);
    }
    @Override
    public int getCount(){
        return listadeportes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.basurita,null);
        TextView textView1= convertView.findViewById(R.id.textview);
        TextView textView2 = convertView.findViewById(R.id.textview2);
        ImageView deporteimg =convertView.findViewById(R.id.imageicon);

        textView1.setText(listadeportes[position]);
        textView2.setText(listacomentar[position]);
        deporteimg.setImageResource(listaimagenes[position]);
        return convertView;
    }
}
