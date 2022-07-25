package com.example.learninggamelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class alphabetRecyclerView extends RecyclerView.Adapter<alphabetRecyclerView.MyViewHolder>{
    ArrayList<alphabetclass> alphabetclass;
    Context context;
    public alphabetRecyclerView (Context context, ArrayList<alphabetclass> alphabetclass){
        this.context=context;
        this.alphabetclass=alphabetclass;
    }




    @NonNull
    @Override
    public alphabetRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull alphabetRecyclerView.MyViewHolder holder, int position) {
        holder.txt1.setText(alphabetclass.get(position).getAlphabetName());
        holder.txt2.setText(alphabetclass.get(position).getSmallName());
    }

    @Override
    public int getItemCount() {
        return alphabetclass.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt1,txt2,txt3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.capital);
            txt2=itemView.findViewById(R.id.small);
        }
    }
}
