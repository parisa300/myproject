package com.aftab.appnew.ApiNetwork;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApplicationModule {

    @Provides
    @RetrofitScope
    public RetrofitApiInterface providesGitHubInterface(Retrofit retrofit) {
        return retrofit.create(RetrofitApiInterface.class);
    }
}