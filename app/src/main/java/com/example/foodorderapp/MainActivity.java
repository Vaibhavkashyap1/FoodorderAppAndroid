package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MainModel> list   = new ArrayList<>();

        list.add(new MainModel(R.drawable.img, "Burger", "5","this is Burger"));
        list.add(new MainModel(R.drawable.img_1, "Pizza", "3","this is pizza"));
        list.add(new MainModel(R.drawable.img, "Cheese burger", "5","this is Cheese burger"));
        list.add(new MainModel(R.drawable.img_1, "Farmhouse pizza", "2","this is Farmhouse pizza"));
        list.add(new MainModel(R.drawable.img, "Double tikki burger", "6","this is Double tikki burger"));
        list.add(new MainModel(R.drawable.img_1, "Onion pizza", "4","this is Onion pizza"));
        list.add(new MainModel(R.drawable.img, "corn pizza", "3","this is corn pizza"));
        list.add(new MainModel(R.drawable.img_1, "Mix-veg pizza", "3","this is Mix-veg pizza"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutmanager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.orders:
               startActivity(new Intent(MainActivity.this,OrderActivity.class));
               break;
       }
        return super.onOptionsItemSelected(item);
    }
}