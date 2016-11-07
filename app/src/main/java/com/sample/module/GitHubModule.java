package com.sample.module;

import com.sample.interfaces.GitHubInterFaces;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by altaf.h.shaikh on 11/7/2016.
 */

@Module
public class GitHubModule {

    @Provides
    public GitHubInterFaces providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(GitHubInterFaces.class);
    }
}
