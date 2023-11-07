package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexample.adapter.MyCustomAdapter;
import com.example.recyclerviewexample.model.FashionModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<FashionModel> fashionModelList;
    MyCustomAdapter myCustomAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        fashionModelList = new ArrayList<>();

        FashionModel a1 = new FashionModel("Netplay","2000","M,L,XXL","White","Shirt,Pant,Shoe",R.drawable.ajioa);
        FashionModel a2 = new FashionModel("Levi's","3000","M,L,XXL","Green","Shirt,Pant,Watch",R.drawable.ajiob);
        FashionModel a3 = new FashionModel("Allen Solly","2500","M,L,XXL","Skyblue","Shirt,Pant,Shoe",R.drawable.ajioc);
        FashionModel a4 = new FashionModel("Adidas","2000","M,L,XXL","Blue","Shirt,Pant,Shoe",R.drawable.ajiod);
        FashionModel a5 = new FashionModel("Us Polo","3500","M,L,XXL","Brown","Shirt,Pant,Watch",R.drawable.ajioe);
        FashionModel a6 = new FashionModel("Puma","2500","M,L,XXL","Orange","Shirt,Pant,Shoe",R.drawable.ajiof);
        FashionModel a7 = new FashionModel("John Players","2000","M,L,XXL","White","Shirt,Pant,Shoe",R.drawable.ajiog);

        fashionModelList.add(a1);
        fashionModelList.add(a2);
        fashionModelList.add(a3);
        fashionModelList.add(a4);
        fashionModelList.add(a5);
        fashionModelList.add(a6);
        fashionModelList.add(a7);

        myCustomAdapter = new MyCustomAdapter(fashionModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);
    }
}