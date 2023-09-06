package com.quizapplications.boyslecture1.Adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.quizapplications.boyslecture1.Model.ModelClass;
import com.quizapplications.boyslecture1.R;
import com.quizapplications.boyslecture1.databinding.ListItemsBinding;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {


    ArrayList<ModelClass> list;

    public AdapterClass(ArrayList<ModelClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass obj = list.get(position);

        holder.binding.textView.setText(obj.getName());
        holder.binding.textView2.setText(obj.getEmail());
        
        holder.binding.textView2.setOnClickListener(v -> {

            Intent whatsapp = new Intent(Intent.ACTION_SEND);
            whatsapp.setType("text/plane");
            whatsapp.setPackage("com.whatsapp");
            whatsapp.putExtra(Intent.EXTRA_TEXT,"YOUR SHARE TEXT HERE");
            v.getContext().startActivity(whatsapp);
            Toast.makeText(v.getContext(), "DataShare", Toast.LENGTH_SHORT).show();




        });


        holder.binding.textView.setOnClickListener(v -> {


          /*  ClipboardManager clipboardManager = (ClipboardManager)  v.getContext().getSystemService(v.getContext().CLIPBOARD_SERVICE);
            ClipData data = (ClipData) ClipData.newPlainText("text","my name is rehan ahmad");
            clipboardManager.setPrimaryClip(data);
            Toast.makeText(v.getContext(), "Data Copy", Toast.LENGTH_SHORT).show();*/

            String phone = "+923139303553";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
            v.getContext().startActivity(intent);


        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

         ListItemsBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ListItemsBinding.bind(itemView);
        }
    }

}
