package com.example.jan.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.liferay.mobile.screens.base.list.BaseListListener;
import com.liferay.mobile.screens.webcontent.WebContent;
import com.liferay.mobile.screens.webcontent.list.WebContentListScreenlet;

import java.util.List;

public class OldMainActivity extends AppCompatActivity implements BaseListListener<WebContent> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_old);

        Button loginButton = (Button) findViewById(R.id.loginbutton);

        WebContentListScreenlet latestnewsList = (WebContentListScreenlet) findViewById(R.id.latestnewslist);
        latestnewsList.setListener(this);
    }


    public void showContactFormActivity(View view) {
        Toast.makeText(this,"Show form now...",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, ContactFormActivity.class));
    }

    public void showFormActivity(View view) {
        Toast.makeText(this,"Show form now...",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, FormActivity.class));
    }

    @Override
    public void onListPageFailed(int startRow, Exception e) {

    }

    @Override
    public void onListPageReceived(int startRow, int endRow, List<WebContent> entries, int rowCount) {

    }

    @Override
    public void onListItemSelected(WebContent element, View view) {
        Intent newsItem = new Intent(this, NewsItem.class);
        newsItem.putExtra("articleId",element.getArticleId());
        startActivity(newsItem);
    }

    @Override
    public void error(Exception e, String userAction) {

    }
}
