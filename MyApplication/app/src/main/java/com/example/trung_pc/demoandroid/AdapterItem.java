package com.example.trung_pc.demoandroid;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Trung-PC on 5/22/2017.
 */

public class AdapterItem extends BaseAdapter {
    private List<Recipe> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public AdapterItem(Context aContext,  List<Recipe> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_list_view, null);
            holder = new ViewHolder();
            holder.flagView = (ImageView) convertView.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.txtTitle);
            holder.txtDetail = (TextView) convertView.findViewById(R.id.txtDetail);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Recipe mRecipe = this.listData.get(position);
        holder.txtTitle.setText(mRecipe.getTitle());
        holder.txtDetail.setText("Detai: " + mRecipe.getDetail());

        int imageId = this.getMipmapResIdByName(mRecipe.getFagimge());

        holder.flagView.setImageResource(imageId);

        return convertView;
    }


    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName , "drawable", pkgName);
        Log.i("AdapterItem", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }
    static class ViewHolder {
        ImageView flagView;
        TextView txtTitle;
        TextView txtDetail;
    }
}
