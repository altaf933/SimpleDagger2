package com.sample.interfaces;

import android.database.Observable;

import com.sample.model.Repository;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by altaf.h.shaikh on 11/7/2016.
 */

public interface GitHubInterFaces {
    @GET("/users/{user}/repos")
    @Headers("User-Agent: DaggerDemo")
    Observable<List<Repository>> listRepos(@Path("user") String user);
}
