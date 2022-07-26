package com.example.learninggamelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class secondA extends AppCompatActivity implements RecyclerViewInterface{
    ArrayList<alphabetclass> alphabetclass= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RecyclerView recyclerView = findViewById(R.id.myrecyclerview);
        setupAlphabets();
        alphabetRecyclerView adapter = new alphabetRecyclerView(this,alphabetclass,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupAlphabets()
    {
        String[] full_sentence = getResources().getStringArray(R.array.full_sentence);
        String[] one_letter_text = getResources().getStringArray(R.array.one_letter_text);
        String[] standsfor=getResources().getStringArray(R.array.standsfor);
        int[] images=
        String[] pictureName=

        for (int i =0; i<full_sentence.length; i++)
        {
            alphabetclass.add(new alphabetclass(full_sentence[i],one_letter_text[i],standsfor[i],
                    ));
        }
    }

    @Override
    public void onItemclick(int position) {
        Intent intent = new Intent(secondA.this,MainActivity2.class);
        intent.putExtra("Name",alphabetclass.get(position).getPicturename());
        intent.putExtra("Image",alphabetclass.get(position).getImage());
        startActivity(intent);


    }
}