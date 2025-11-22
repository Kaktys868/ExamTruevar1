package com.example.exam0103truevar1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PogodaAdapter extends RecyclerView.Adapter<PogodaAdapter>.ViewHolder {
    public ArrayList<Pogoda> Pogodas;

    public PogodaAdapter(ArrayList<Pogoda> Pogodas){
        this.Pogodas = Pogodas;
    }
    @NonNull
    @Override
    public ViewHolder OnCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView day;
        TextView grad;
        TextView weather;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            day = itemView.findViewById(R.id.Day);
            grad = itemView.findViewById(R.id.Grad);
            weather = itemView.findViewById(R.id.Weather);
        }
    }
}
