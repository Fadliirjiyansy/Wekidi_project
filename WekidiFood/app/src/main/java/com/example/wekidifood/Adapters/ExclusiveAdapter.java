package com.example.wekidifood.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wekidifood.R;
import com.example.wekidifood.models.ExclusiveModel;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class ExclusiveAdapter extends RecyclerView.Adapter<ExclusiveAdapter.ViewHolder> {

    public ExclusiveAdapter(List<ExclusiveModel> list) {
        this.list = list;
    }

    List<ExclusiveModel> list;

//    ExclusiveAdapter exclusiveAdapter;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.gold_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.roundedImageView.setImageResource(list.get(position).getImg());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView roundedImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView2);
        }
    }
}
