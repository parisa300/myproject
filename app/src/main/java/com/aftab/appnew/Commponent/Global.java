package com.aftab.appnew.Commponent;

import android.app.Application;
import android.content.Context;


import com.aftab.appnew.ApiNetwork.AppModule;
import com.aftab.appnew.ApiNetwork.ApplicationComponent;
import com.aftab.appnew.ApiNetwork.ApplicationModule;
import com.aftab.appnew.ApiNetwork.DaggerApplicationComponent;
import com.aftab.appnew.ApiNetwork.DaggerNetComponent;
import com.aftab.appnew.ApiNetwork.NetComponent;
import com.aftab.appnew.ApiNetwork.NetModule;


public class Global extends Application {

    public static DaggerApplicationComponent applicationComponent;
    public static AppModule appModule;
    private NetComponent mNetComponent;
    public static Context context;
    public static String token = "userToken";
    public static String version = "1.0";
    public static String BaseURL = "http://192.168.1.100/qm/";
    //    public static String BaseURL = "http://192.168.1.160/SoftKey_ERP_Cloud/";
    //  public static String BaseURL = "http://192.168.1.160/SoftKey_ERP_Cloud/";
//    public static String BaseURL = "http://qmarket2.softkeyapi.com/";
    public static String mainUrl = BaseURL + "api/";

    public static String mainUrlImage = BaseURL;
    public void onCreate() {

        super.onCreate();
        Global.context = getApplicationContext();

        appModule=new AppModule(this);
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule())
                .build();

        applicationComponent = (DaggerApplicationComponent) DaggerApplicationComponent.builder()
                .netComponent(mNetComponent)
                .applicationModule(new ApplicationModule())
                .build();

    }
    public static String getBaseUrl() {
        return BaseURL;
    }

    public ApplicationComponent getGitHubComponent() {
        return applicationComponent;
    }
}

