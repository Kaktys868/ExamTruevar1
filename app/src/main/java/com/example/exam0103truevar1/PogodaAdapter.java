package com.example.exam0103truevar1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class PogodaAdapter extends RecyclerView.Adapter {
    public ArrayList<Pogoda> Pogodas;
    public int n;

    public PogodaAdapter(ArrayList<Pogoda> Pogodas){
        this.Pogodas = Pogodas;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return Pogodas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView day;
        TextView grad;
        TextView weather;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            day = itemView.findViewById(R.id.Day);
            day.setText(Pogodas.get(n).Day);
            grad = itemView.findViewById(R.id.Grad);
            grad.setText(Pogodas.get(n).Grad.toString());
            weather = itemView.findViewById(R.id.Weather);
            weather.setText(Pogodas.get(n).Weather);
            n++;
        }
    }
}
