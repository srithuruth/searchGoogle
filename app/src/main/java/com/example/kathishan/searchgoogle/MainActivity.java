package com.example.kathishan.searchgoogle;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

        private EditText query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        query = findViewById((R.id.etQuery));

    }

    public void DoSearch(View view){

        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String term = query.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);
            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
