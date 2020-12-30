package com.codingcrew.recview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {


    // context
    // arraylist
    private Context context;
    private ArrayList<Notes> notes;

    // constructor
    public NotesAdapter(Context context) {
        this.context = context;
        notes = new ArrayList<Notes>();
    }

    // notes setter
    public void setNotes(ArrayList<Notes> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Layout Inflator
        View view = LayoutInflater.from(context).inflate(R.layout.item_notes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // String Setting
        holder.title.setText(notes.get(position).getTitle());
        holder.desc.setText(notes.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        // size
        return notes.size();
    }

    // View Holder

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title, desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // id connect
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
