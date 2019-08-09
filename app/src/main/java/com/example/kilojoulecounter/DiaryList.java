package com.example.kilojoulecounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

// list to view different entries
public class DiaryList extends AppCompatActivity {

    private List<Diary> diaryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DiaryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_list);

        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new DiaryAdapter(diaryList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareDiaryData();
    }

    private void prepareDiaryData(){
        Diary diary = new Diary(1,2,3,4,5,6,7);
        diaryList.add(diary);

        diary = new Diary(4,5,6,7,8,9,0);
        diaryList.add(diary);

        diary = new Diary(0,0,0,0,0,0,0);
        diaryList.add(diary);
        mAdapter.notifyDataSetChanged();
    }
}
