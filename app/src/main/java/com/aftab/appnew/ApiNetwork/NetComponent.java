package com.aftab.appnew.ApiNetwork;

import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {

    Retrofit retrofit();
    RequestManager glide();

}