package com.example.malik.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

//    vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();
    }
    
    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://seeklogo.com/images/A/android-icon-logo-DB06FA8B39-seeklogo.com.png");
        mNames.add("Android");

        mImageUrls.add("https://www.atlaslisboa.com/wp-content/uploads/2017/08/56-apple-512.png");
        mNames.add("Iphone");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Blackberry_Logo_without_wordmark.svg/2000px-Blackberry_Logo_without_wordmark.svg.png");
        mNames.add("Blackberry");

        mImageUrls.add("http://i.imgur.com/zQSQy.png");
        mNames.add("WebOS");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/c/c7/Windows_logo_-_2012.png");
        mNames.add("Windows");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/OS_X_El_Capitan_logo.svg/1024px-OS_X_El_Capitan_logo.svg.png");
        mNames.add("MacOS X");


        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init RecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager((new LinearLayoutManager(this)));
    }
}
