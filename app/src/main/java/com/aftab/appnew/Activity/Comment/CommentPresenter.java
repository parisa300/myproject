package com.aftab.appnew.Activity.Comment;

import com.aftab.appnew.Model.ModelComment;
import com.aftab.appnew.ApiNetwork.RetrofitApiInterface;
import com.aftab.appnew.Srtuctures.UnauthorizedView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class CommentPresenter {
    private RetrofitApiInterface retrofitApiInterface;
    private CommentView commentView;
    private UnauthorizedView unauthorizedView;
    private CompositeDisposable disposable;

    public CommentPresenter(RetrofitApiInterface retrofitApiInterface, CommentView commentView,UnauthorizedView unauthorizedView) {
        this.retrofitApiInterface = retrofitApiInterface;
        this.commentView = commentView;
        this.unauthorizedView = unauthorizedView;
        disposable = new CompositeDisposable();
    }

    public void Get_List(String IMEI,String Token) {

        commentView.showWait();

        retrofitApiInterface.getcomment(IMEI,Token)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<Response<ModelComment>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        disposable.add(d);
                    }

                    @Override
                    public void onNext(Response<ModelComment> modelCommentResponse) {
                        commentView.removeWait();
                        if (modelCommentResponse.code() == 200) {

                            commentView.Response(modelCommentResponse.body());

                        } else if (modelCommentResponse.code() == 401) {
                            unauthorizedView.SetLogOut();

                        } else {
                            commentView.onServerFailure(modelCommentResponse.body());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        commentView.removeWait();
                        commentView.onFailure(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
