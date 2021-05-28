package com.example.lessons3_android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnRecyclerItemClick {
    RecyclerView recyclerview;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview = findViewById(R.id.recyclerview);
        adapter = new Adapter();
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);
        setupRecyclerView();
    }

    private void setupRecyclerView(){
        recyclerview = findViewById(R.id.recyclerview);
        adapter = new Adapter();
        recyclerview.setAdapter(adapter);
        adapter.setListener(this);
        adapter.setUsers(getUsersList());
    }

    private ArrayList<User> getUsersList(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Argen","16", R.drawable.user_image));
        users.add(new User("Aibek","21", R.drawable.user_image));
        users.add(new User("Umar","32", R.drawable.user_image));
        users.add(new User("Jaks","20", R.drawable.user_image));
        users.add(new User("Ulan","22", R.drawable.user_image));
        users.add(new User("Guzel","15", R.drawable.user_image));
        users.add(new User("Jyldyz","24", R.drawable.user_image));
        users.add(new User("Ais","22", R.drawable.user_image));
        users.add(new User("Salkyn","28", R.drawable.user_image));
        users.add(new User("Aman","46", R.drawable.user_image));
        users.add(new User("Human","26", R.drawable.user_image));
        users.add(new User("Bermet","12", R.drawable.user_image));
        return users;
    }

    @Override
    public void OnClickListener(User user) {
        Toast.makeText(this, new StringBuilder().append("name: ").append(user.getName()).append("age: ").append(user.getAge()).toString(), Toast.LENGTH_LONG ).show();
    }

}