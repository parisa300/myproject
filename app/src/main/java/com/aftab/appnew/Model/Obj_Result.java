package com.aftab.appnew.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Obj_Result {

    @SerializedName("img_url")
    @Expose
    private String img_url;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("subject")
    @Expose
    private String subject;

    @SerializedName("body")
    @Expose
    private String body;

    @SerializedName("status")
    @Expose
    private int status;

    @SerializedName("id_product")
    @Expose
    private int id_product;

    @SerializedName("id_user")
    @Expose
    private int id_user;

    @SerializedName("Is_unknown")
    @Expose
    private boolean Is_unknown;

    @SerializedName("like_count")
    @Expose
    private int like_count;

    @SerializedName("dislike_count")
    @Expose
    private int dislike_count;

    @SerializedName("datetime_comment")
    @Expose
    private String datetime_comment;

    @SerializedName("advicetype")
    @Expose
    private int advicetype;

    @SerializedName("full_name")
    @Expose
    private String full_name;


    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }



    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getDislike_count() {
        return dislike_count;
    }

    public void setDislike_count(int dislike_count) {
        this.dislike_count = dislike_count;
    }

    public String getDatetime_comment() {
        return datetime_comment;
    }

    public void setDatetime_comment(String datetime_comment) {
        this.datetime_comment = datetime_comment;
    }

    public int getAdvicetype() {
        return advicetype;
    }

    public void setAdvicetype(int advicetype) {
        this.advicetype = advicetype;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public boolean isIs_unknown() {
        return Is_unknown;
    }

    public void setIs_unknown(boolean is_unknown) {
        Is_unknown = is_unknown;
    }
}
