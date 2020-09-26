package com.aftab.appnew.ApiNetwork;


import com.aftab.appnew.Activity.Comment.CommentActivity;

import dagger.Component;


@RetrofitScope
@Component(dependencies = NetComponent.class, modules = ApplicationModule.class)

public interface ApplicationComponent {

   void inject_comment(CommentActivity commentActivity);

}