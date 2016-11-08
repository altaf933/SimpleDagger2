package com.sample.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sample.MyApplication;
import com.sample.interfaces.GitHubInterFaces;
import com.sample.model.Repository;

import java.util.ArrayList;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    Retrofit mRetrofit;

    @Inject
    GitHubInterFaces gitHubInterFaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getmGitHubComponent().inject(this);

        Call<ArrayList<Repository>> callSquare = gitHubInterFaces.listRepos("square");
        callSquare.enqueue(new Callback<ArrayList<Repository>>() {
            @Override
            public void onResponse(Call<ArrayList<Repository>> call, Response<ArrayList<Repository>> response) {

            }

            @Override
            public void onFailure(Call<ArrayList<Repository>> call, Throwable t) {

            }
        });


//        ((MyApplication)getApplication().ge

    }
}
