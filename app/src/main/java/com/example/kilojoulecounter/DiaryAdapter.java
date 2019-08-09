package com.example.kilojoulecounter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DiaryAdapter extends RecyclerView.Adapter<DiaryAdapter.MyViewHolder> {
    private List<Diary> diaryList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView date, nki;
        public MyViewHolder(View view){
            super(view);
            date = view.findViewById(R.id.date);
            nki = view.findViewById(R.id.nki);
        }
    }

    public DiaryAdapter(List<Diary> diaryList){
        this.diaryList = diaryList;
    }


    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.diary_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder, int position){
        Diary diary = diaryList.get(position);
        holder.date.setText(diary.getDate());
        holder.nki.setText(Double.toString(diary.nettKiloJoule()));
    }

    public int getItemCount(){
        return diaryList.size();
    }
}
