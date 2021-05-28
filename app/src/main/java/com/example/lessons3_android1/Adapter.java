package com.example.lessons3_android1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<User> users = new ArrayList<>();
    private OnRecyclerItemClick listener;


    public Adapter() {
    }
    public void setUsers(ArrayList<User> users){
        this.users = users;
        notifyDataSetChanged();
    }

    public void setListener(OnRecyclerItemClick listener) {
        this.listener = listener;
    }

    @Override
    public MainViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.my_view_holder,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
    holder.onBind(users.get(position));
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            listener.OnClickListener(users.get(position));
        }
    });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
