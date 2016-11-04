package com.soyoung.sopt_19th_3.ch1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.soyoung.sopt_19th_3.R;

/**
 * Created by Soyoung on 16. 10. 29..
 */
public class ch1ViewHolder extends RecyclerView.ViewHolder{
    TextView titleView;
    TextView contentView;
    ImageView imageView;

    public ch1ViewHolder(View itemView) {
        super(itemView);


        imageView = (ImageView)itemView.findViewById(R.id.imageView1);
        titleView = (TextView)itemView.findViewById(R.id.titleTextView);
        contentView = (TextView)itemView.findViewById(R.id.contentTextView);
    }
}
