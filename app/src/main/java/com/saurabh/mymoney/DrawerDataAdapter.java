package com.saurabh.mymoney;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class DrawerDataAdapter extends RecyclerView.Adapter<DrawerDataAdapter.MyViewHolder> {

    Context context;
    private LayoutInflater inflator;
    List<DrawerListData> data = Collections.EMPTY_LIST;

    public DrawerDataAdapter(Context context, List<DrawerListData> data) {
        inflator = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.drawer_list, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        DrawerListData current = data.get(position);
        //holder.icon.setImageDrawable( ContextCompat.getDrawable( context.getApplicationContext(),current.getIcon() ));
        holder.title.setText(current.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
        }

    }
}
