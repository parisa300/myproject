package com.aftab.appnew.Activity.Comment;

import com.aftab.appnew.Model.ModelComment;

public interface CommentView {

    void showWait();

    void removeWait();

    void onFailure(String message);

    void onServerFailure(ModelComment modelComment);

    void Response(ModelComment modelComment);
}
