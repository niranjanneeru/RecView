package com.codingcrew.recview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Recycler,Adapter,Notes ArrayList
    // Notes Class

    private RecyclerView recyclerView;
    private NotesAdapter adapter;
    private ArrayList<Notes> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Id Recycler View

        recyclerView = findViewById(R.id.notes_recycler_View);
        adapter = new NotesAdapter(this);
        recyclerView.setAdapter(adapter);
        notes = new ArrayList<>();
        notes.add(new Notes("This is a Title", "This is a Desc"));
        notes.add(new Notes("This is a Title", "This is a Desc"));
        notes.add(new Notes("This is a Title", "This is a Desc"));
        adapter.setNotes(notes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}