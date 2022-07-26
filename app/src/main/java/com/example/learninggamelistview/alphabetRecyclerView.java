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
    ArrayList<alphabetclass> alphabetClass;
    Context context;
    private final RecyclerViewInterface recyclerViewInterface;
    public alphabetRecyclerView (Context context, ArrayList<alphabetclass> alphabetClass,
                                 RecyclerViewInterface recyclerViewInterface){
        this.context=context;
        this.alphabetClass=alphabetClass;
        this.recyclerViewInterface=recyclerViewInterface;
    }




    @NonNull
    @Override
    public alphabetRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.recyclerview_row,parent,false);

        return new alphabetRecyclerView.MyViewHolder(view,recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull alphabetRecyclerView.MyViewHolder holder, int position) {
        holder.txt1.setText(alphabetClass.get(position).getAlphabetName());
        holder.txt2.setText(alphabetClass.get(position).getSmallName());
        holder.txt3.setText(alphabetClass.get(position).getAlphabetStandsfor());

    }

    @Override
    public int getItemCount() {
        return alphabetClass.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt1,txt2,txt3;

        public MyViewHolder(@NonNull View itemView,RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            txt1=itemView.findViewById(R.id.capital);
            txt2=itemView.findViewById(R.id.small);
            txt3=itemView.findViewById(R.id.standfor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(recyclerViewInterface!=null)
                    {
                        int pos =getAdapterPosition();

                        if(pos!=RecyclerView.NO_POSITION)
                        {
                            recyclerViewInterface.onItemclick(pos);
                        }
                    }
                }
            });
        }
    }
}
