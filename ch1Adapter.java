package com.soyoung.sopt_19th_3.ch1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soyoung.sopt_19th_3.R;

import java.util.ArrayList;

/**
 * Created by Soyoung on 16. 10. 29..
 */
public class ch1Adapter extends RecyclerView.Adapter<ch1ViewHolder>{ //클래스 이름에 ctrl+enter해서 생성자 만들기

    ArrayList<itemData> itemDatas;
    View.OnClickListener clickEvent;

    public ch1Adapter(ArrayList<itemData> itemDatas, View.OnClickListener clickEvent) {
        this.itemDatas = itemDatas;
        this.clickEvent = clickEvent;
    }

    @Override
    public ch1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_layout, parent, false);

        ch1ViewHolder viewHolder = new ch1ViewHolder(itemView);
        itemView.setOnClickListener(clickEvent);

        return viewHolder;
    }

    //리스트 항목을 뿌려주는  역할을 하는 메소드
    @Override
    public void onBindViewHolder(ch1ViewHolder holder, int position) {
        holder.titleView.setText(itemDatas.get(position).title);
        holder.contentView.setText(itemDatas.get(position).content);
        holder.imageView.setImageResource(itemDatas.get(position).image);
    }

    @Override
    public int getItemCount() {
        return (itemDatas != null) ? itemDatas.size():0;
    }
}
