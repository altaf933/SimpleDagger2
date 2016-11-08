package com.sample.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.interfaces.GitHubInterFaces;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    @Inject
//    Retrofit mRetrofit;

    @Inject
    GitHubInterFaces gitHubInterFaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ((MyApplication)getApplication().ge

    }
}
