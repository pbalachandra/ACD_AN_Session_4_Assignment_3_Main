package com.acadgild.balu.acd_an_session_4_assignment_3_main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by BALU on 5/10/2016.
 */
public class ImageAdaptor extends BaseAdapter
{
    public Integer[] images = {R.drawable.gingerbread, R.drawable.honeycomb,
                                     R.drawable.icecream, R.drawable.jellybean,
                                     R.drawable.kitkat, R.drawable.lollipop};
    private Context context;
    public ImageAdaptor(Context context)
    {
        this.context = context;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView;

        if (convertView == null)
        {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(images[position]);
        return imageView;
    }
}
