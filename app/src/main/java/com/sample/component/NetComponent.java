package com.sample.component;

import android.content.SharedPreferences;

import com.sample.module.AppModule;
import com.sample.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by altaf.h.shaikh on 11/3/2016.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {
    // remove injection methods if downstream modules will perform injection

    // downstream components need these exposed
    // the method name does not matter, only the return type
    Retrofit retrofit();
    OkHttpClient okHttpClient();
    SharedPreferences sharedPreferences();
}
