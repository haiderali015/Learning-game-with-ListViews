package com.example.learninggamelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<alphabetclass> alphabetclass= new ArrayList<>();

    Button btn, btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.myrecyclerview);
        setupAlphabets();
        alphabetRecyclerView adapter = new alphabetRecyclerView(this,alphabetclass);
//        btn = findViewById(R.id.learn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), secondA.class);
//                startActivity(i);
//
//            }
//        });
//
//        btn1 = findViewById(R.id.repository);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Uri uri = Uri.parse("https://github.com/haiderali015/javadailywork");
//                Intent i = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(i);
//
//            }
//        });

//        btn2=findViewById(R.id.exam);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(),fourthA.class);
//                startActivity(i);
//
//            }
//        });
    }

    private void setupAlphabets()
    {
        String [] full_sentence = getResources().getStringArray(R.array.full_sentence);
        String [] one_letter_text = getResources().getStringArray(R.array.one_letter_text);

        for (int i =0; i<full_sentence.length; i++)
        {
            alphabetclass.add(new alphabetclass(full_sentence[i],one_letter_text[i]));
        }
    }

}