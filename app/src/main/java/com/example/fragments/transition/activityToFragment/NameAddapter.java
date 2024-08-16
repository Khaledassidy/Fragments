package com.example.fragments.transition.activityToFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.R;

import java.util.ArrayList;

public class NameAddapter extends RecyclerView.Adapter<NameAddapter.viewholder> {

    ArrayList<Name> arrayList;
    onitemclick onitemclick;


    public NameAddapter(ArrayList<Name> arrayList,onitemclick onitemclick){
        this.arrayList=arrayList;
        this.onitemclick=onitemclick;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.costume_name,parent,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.name.setText(arrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
            TextView name;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textname);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            onitemclick.onitemclick(arrayList.get(getAdapterPosition()));

        }
    }
}
