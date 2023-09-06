package com.quizapplications.boyslecture1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.quizapplications.boyslecture1.Adapter.AdapterClass;
import com.quizapplications.boyslecture1.Model.ModelClass;
import com.quizapplications.boyslecture1.databinding.FragmentOneBinding;

import java.util.ArrayList;


public class FragmentOne extends Fragment {



    public FragmentOne() {
        // Required empty public constructor
    }


    FragmentOneBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<ModelClass> list;

        binding = FragmentOneBinding.inflate(inflater,container,false);


        list = new ArrayList<>();

        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));
        list.add(new ModelClass("Rehan","rehan@gmail.com"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        AdapterClass adapter = new AdapterClass(list);

        binding.myrecycler.setLayoutManager(layoutManager);
        binding.myrecycler.setAdapter(adapter);




        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





    }
}