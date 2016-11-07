package com.sample.component;

import com.sample.dagger2.MainActivity;
import com.sample.module.AppModule;
import com.sample.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by altaf.h.shaikh on 11/3/2016.
 */

@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}
