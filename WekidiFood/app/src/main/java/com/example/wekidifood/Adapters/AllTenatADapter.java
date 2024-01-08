package com.example.wekidifood.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wekidifood.R;
import com.example.wekidifood.models.AllTenantModel;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class AllTenatADapter extends RecyclerView.Adapter<AllTenatADapter.ViewHolder> {


    List<AllTenantModel> list;

    public AllTenatADapter(List<AllTenantModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AllTenatADapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.all_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull AllTenatADapter.ViewHolder holder, int position) {
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
