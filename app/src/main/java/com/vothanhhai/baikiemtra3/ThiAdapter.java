package com.vothanhhai.baikiemtra3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThiAdapter extends BaseAdapter {
    private Activity activity;
    private List<Thi> thiList;

    private class ViewHolder{
        TextView tenThi, moTa;
        ImageView anhtacgia;
    }

    public ThiAdapter(Activity activity, List<Thi> thiList){
        this.activity = activity;
        this.thiList = thiList;
    }

    public Context getContext() {
        return activity;
    }

    public void setContext(Activity activity) {
        this.activity = activity;
    }

    public List<Thi> getThiList() {
        return thiList;
    }

    public void setThiList(List<Thi> thiList) {
        this.thiList = thiList;
    }

    @Override
    public int getCount() {
        return thiList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView =inflater.inflate(R.layout.layout_item, null);

            holder =new ViewHolder();

            holder.anhtacgia = convertView.findViewById(R.id.imageAnhtacgia);
            holder.tenThi = convertView.findViewById(R.id.textViewTentacgia);
            holder.moTa = convertView.findViewById(R.id.textViewMoTa);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        Thi thi = thiList.get(position);

        holder.anhtacgia.setImageResource(thi.getResourceId());
        holder.tenThi.setText(thi.getTenThi());
        holder.moTa.setText(thi.getMoTa());

        return convertView;
    }
}
