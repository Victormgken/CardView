package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPost;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerView);

        //Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPost.setLayoutManager(layoutManager);
        //Define Adapter
        this.preparePosts();
        Adapter adapter = new Adapter(posts);
        recyclerPost.setAdapter(adapter);
    }

    public void preparePosts(){
        Post p;
        p = new Post("Joao", "agora","#tbt Viagem Legal!", R.drawable.imagem1);
        this.posts.add(p);

        p = new Post("Jean", "5 minutos", "#tbt Voyage cool!", R.drawable.imagem2);
        this.posts.add(p);

         p = new Post("Giovani", "15 minutos","#tbt Bel viaggio!", R.drawable.imagem3);
        this.posts.add(p);

         p = new Post("Jan", "ontem","#tbt Bèl Vwayaj!", R.drawable.imagem4);
        this.posts.add(p);

         p = new Post("John","ontem","#TBT Cool Travel!", R.drawable.imagem1);
        this.posts.add(p);

         p = new Post("Juan","antes da pandemia","#tbt Viaje genial!", R.drawable.imagem2);
        this.posts.add(p);
    }
}