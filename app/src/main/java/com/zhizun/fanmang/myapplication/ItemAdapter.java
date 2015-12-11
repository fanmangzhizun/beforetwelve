package com.zhizun.fanmang.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 凡芒至尊 on 2015/12/11.
 */

    public class ItemAdapter extends ArrayAdapter<Listel> {
        public int resourceid;

        public ItemAdapter(Context context, int resourced, List<Listel> objects) {
            super(context, resourced, objects);
            resourceid = resourced;
        }

        public View getview(int position,View convertView,ViewGroup parent) {
          Listel listel=getItem(position);
            View view= LayoutInflater.from(getContext()).inflate(resourceid, null);
            ImageView imageView=(ImageView)view.findViewById(R.id.picture);
            TextView textView=(TextView)view.findViewById(R.id.text);
            imageView.setImageResource(listel.getPictureid());
            textView.setText(listel.gettxt());
            return view;
        }
}
