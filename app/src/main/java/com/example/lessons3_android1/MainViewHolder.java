package com.example.lessons3_android1;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    private ImageView avatar;
    private TextView name, age;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.vh_image);
        name = itemView.findViewById(R.id.name);
        age = itemView.findViewById(R.id.age);
    }

    public void onBind(User user) {
        avatar.setImageResource(user.getImage());
        name.setText(user.getName());
        age.setText(user.getAge());
    }

}
