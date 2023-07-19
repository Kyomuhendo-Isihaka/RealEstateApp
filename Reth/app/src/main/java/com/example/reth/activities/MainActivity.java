package com.example.reth.activities;

import com.example.reth.Adapters.ItemsAdapter;
import com.example.reth.Domain.ItemsDomain;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.reth.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular, adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void  initRecyclerView(){
        ArrayList<ItemsDomain> ItemsArrayList=new ArrayList<>();

        ItemsArrayList.add(new ItemsDomain("House with a great view","Lira city uganda","This 2 bed /1 bath have boasts,\n"+
                "Open-living plan, accented by Striking \n" +
                "architectural features and high-end finishes. \n"+
                "Fell inspired by open sight lines that \n" +
                "embrace the outdoors, crowned by stunning\n" +
                "coffered ceilings.", 2, 1, 450000,"pic1", true));

        ItemsArrayList.add(new ItemsDomain("House with a great view","Lira city uganda","This 2 bed /1 bath have boasts,\n"+
                "Open-living plan, accented by Striking \n" +
                "architectural features and high-end finishes. \n"+
                "Fell inspired by open sight lines that \n" +
                "embrace the outdoors, crowned by stunning\n" +
                "coffered ceilings.", 3, 1, 350000,"pic2", false));

        ItemsArrayList.add(new ItemsDomain("House with a great view","Lira city uganda","This 2 bed /1 bath have boasts,\n"+
                "Open-living plan, accented by Striking \n" +
                "architectural features and high-end finishes. \n"+
                "Fell inspired by open sight lines that \n" +
                "embrace the outdoors, crowned by stunning\n" +
                "coffered ceilings.", 2, 1, 450000,"pic1", true));


        recyclerViewPopular = findViewById(R.id.viewPopular);
        recyclerViewNew = findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterNew = new ItemsAdapter(ItemsArrayList);
        adapterPopular=new ItemsAdapter(ItemsArrayList);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);
    }

}