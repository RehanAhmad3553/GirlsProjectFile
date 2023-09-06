package com.quizapplications.boyslecture1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.quizapplications.boyslecture1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FragmentOne fragmentOne= new FragmentOne();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Linear,fragmentOne);
        transaction.commit();






        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentOne fragmentOne= new FragmentOne();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.Linear,fragmentOne);
                transaction.commit();

            }
        });

        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.Linear,fragmentTwo);
                transaction.commit();

            }
        });








    }}




