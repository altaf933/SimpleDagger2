package com.sample;

import android.app.Application;

import com.sample.component.DaggerGitHubComponent;
import com.sample.component.DaggerNetComponent;
import com.sample.component.GitHubComponent;
import com.sample.component.NetComponent;
import com.sample.module.AppModule;
import com.sample.module.GitHubModule;
import com.sample.module.NetModule;

/**
 * Created by altaf.h.shaikh on 11/3/2016.
 */

public class MyApplication extends Application {
    private NetComponent netComponent;
    private GitHubComponent mGitHubComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // Dagger%COMPONENT_NAME%
        netComponent = DaggerNetComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule("https://api.github.com"))

                .build();

        mGitHubComponent = DaggerGitHubComponent.builder()
                .netComponent(netComponent)
                .gitHubModule(new GitHubModule()).build();


    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
