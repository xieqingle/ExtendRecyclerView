package com.cesecsh.extendrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.cesecsh.extendrecyclerview.baseAdapter.HeaderFootRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        data();
        RecyclerAdapter adapter = new RecyclerAdapter(this, R.layout.item_recycler_adapter, datas);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        HeaderFootRecyclerAdapter adapter1 = new HeaderFootRecyclerAdapter(adapter);
        adapter1.addHeaderView(LayoutInflater.from(this).inflate(R.layout.item_header, recyclerView, false));
        adapter1.setEmptyView(LayoutInflater.from(this).inflate(R.layout.item_empty_view, recyclerView, false));
        recyclerView.setAdapter(adapter1);


    }

    private void data() {
        datas = new ArrayList<>();
        for (int i = 30; i > 0; i--) {
            datas.add("上海中电第" + i + "个分公司");
        }
    }
}
