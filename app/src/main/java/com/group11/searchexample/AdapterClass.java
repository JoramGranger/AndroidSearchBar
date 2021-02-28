package com.group11.searchexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
    ArrayList<Deal> dealList;
    AdapterClass(ArrayList<Deal> dealList)
    {
        this.dealList = dealList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_holder, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(dealList.get(position).getMake());
        holder.location.setText(dealList.get(position).getBrand());
        /*holder.price.setText(dealList.get(position).getPrice());*/
        int p = dealList.get(position).getPrice();
        String pS = Integer.toString(p);
        holder.price.setText(pS);

    }

    @Override
    public int getItemCount() {
        return dealList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, location, price;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.pName);
            location = itemView.findViewById(R.id.pLocation);
            price = itemView.findViewById(R.id.pPrice);
            imageView = itemView.findViewById(R.id.pImage);
        }
    }
}
