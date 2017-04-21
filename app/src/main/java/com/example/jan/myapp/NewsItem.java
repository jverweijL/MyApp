package com.example.jan.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liferay.mobile.screens.webcontent.display.WebContentDisplayScreenlet;

public class NewsItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsitem);

        WebContentDisplayScreenlet newsItem = (WebContentDisplayScreenlet) this.findViewById(R.id.newsitemarticle);
        newsItem.setArticleId(getIntent().getStringExtra("articleId"));

    }
}
