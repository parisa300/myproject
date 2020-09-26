package com.aftab.appnew.Activity.Comment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aftab.appnew.Adapter.Adapter_comment;
import com.aftab.appnew.Commponent.Global;
import com.aftab.appnew.Model.ModelComment;
import com.aftab.appnew.Model.Obj_Result;
import com.aftab.appnew.ApiNetwork.RetrofitApiInterface;
import com.aftab.appnew.R;
import com.aftab.appnew.Srtuctures.UnauthorizedView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


public class CommentActivity extends AppCompatActivity implements CommentView, UnauthorizedView {
    @Inject
    RetrofitApiInterface retrofitInterface;
    Adapter_comment adapter_comment;
    RecyclerView rvReplayListComment;
    private CommentPresenter commentPresenter;
    List<Obj_Result> listinfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comment);
        rvReplayListComment = findViewById(R.id.rvReplayListComment);
        ((Global) getApplication()).getGitHubComponent().inject_comment(this);
        commentPresenter = new CommentPresenter(retrofitInterface, this,this);
        setupRecyclerReplayListComment();
        initi_list();
    }

    private void setupRecyclerReplayListComment() {
        adapter_comment = new Adapter_comment(listinfo, this);
        rvReplayListComment.setLayoutManager(new LinearLayoutManager(this));
        rvReplayListComment.setHasFixedSize(true);
        rvReplayListComment.setNestedScrollingEnabled(true);
    }

    private void initi_list() {
        commentPresenter.Get_List("1","2103ad45-8f0d-42e0-bf2f-717a8adc2d56");

    }


    @Override
    public void showWait() {

    }

    @Override
    public void removeWait() {

    }

    @Override
    public void onFailure(String message) {

    }

    @Override
    public void onServerFailure(ModelComment modelComment) {

    }
    @Override
    public void Response(ModelComment modelComment) {

        listinfo=modelComment.getC().getResult();
        adapter_comment.setData(listinfo);
        rvReplayListComment.setAdapter(adapter_comment);
    }

    @Override
    public void SetLogOut() {

    }
}
