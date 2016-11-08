package com.sample.interfaces;

import com.sample.model.Repository;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by altaf.h.shaikh on 11/7/2016.
 */

public interface GitHubInterFaces {
    @GET("/users/{user}/repos")
    @Headers("User-Agent: DaggerDemo")
    Call<ArrayList<Repository>> listRepos(@Path("user") String user);
}
