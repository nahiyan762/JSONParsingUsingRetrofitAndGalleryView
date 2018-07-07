package com.example.hp.jsonparsingusingretrofitandgalleryview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IndiItemViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indi_item_view);

        ImageView imageView = findViewById(R.id.gview);
        TextView name = findViewById(R.id.name);
        TextView realname = findViewById(R.id.realname);
        TextView team = findViewById(R.id.team);
        TextView firstappearance = findViewById(R.id.firstappearance);
        TextView createdby = findViewById(R.id.createdby);
        TextView publisher = findViewById(R.id.publisher);
        TextView bio = findViewById(R.id.bio);


        String imagePath = getIntent().getStringExtra("image");

        Glide.with(this).asBitmap().load(imagePath).into(imageView);
        name.setText(getIntent().getStringExtra("name"));
        realname.setText(getIntent().getStringExtra("realname"));
        team.setText(getIntent().getStringExtra("team"));
        firstappearance.setText(getIntent().getStringExtra("firstappearance"));
        createdby.setText(getIntent().getStringExtra("createdby"));
        publisher.setText(getIntent().getStringExtra("publisher"));
        bio.setText(getIntent().getStringExtra("bio"));


    }
}
