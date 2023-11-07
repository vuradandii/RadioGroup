package com.example.recyclerviewexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.model.FashionModel;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.FashionViewHolder> {

    List<FashionModel> fashionModelList;

    public MyCustomAdapter(List<FashionModel> fashionModelList) {
        this.fashionModelList = fashionModelList;
    }

    @NonNull
    @Override
    public MyCustomAdapter.FashionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        return new FashionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.FashionViewHolder holder, int position) {

        FashionModel fashionModel = fashionModelList.get(position);

        holder.textView.setText(fashionModel.getName());
        holder.textView.setText(fashionModel.getPrice());
        holder.textView.setText(fashionModel.getPrice());
        holder.textView.setText(fashionModel.getColour());
        holder.textView.setText(fashionModel.getDescription());
        holder.imageView.setImageResource(fashionModel.getImage());

    }

    @Override
    public int getItemCount() {
        return fashionModelList.size();
    }

    public static class FashionViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public FashionViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.name);
            textView = itemView.findViewById(R.id.price);
            textView = itemView.findViewById(R.id.size);
            textView = itemView.findViewById(R.id.colour);
            textView = itemView.findViewById(R.id.description);
            imageView = itemView.findViewById(R.id.image);

        }
    }
}
