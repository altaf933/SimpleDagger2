package com.sample.component;

import com.sample.UserScope;
import com.sample.dagger2.MainActivity;
import com.sample.module.GitHubModule;

import dagger.Component;

/**
 * Created by altaf.h.shaikh on 11/7/2016.
 */

@UserScope
@Component(dependencies = NetComponent.class, modules = GitHubModule.class)
public interface GitHubComponent {
    void inject(MainActivity activity);
}
