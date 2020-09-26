package com.aftab.appnew.ApiNetwork;


import com.aftab.appnew.Model.ModelComment;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitApiInterface {

    @GET("api/app/m_get_comment_list_by_userid")
    Observable<Response<ModelComment>> getcomment(
            @Query("IMEI") String IMEI,
            @Query("token") String token
    );

}

