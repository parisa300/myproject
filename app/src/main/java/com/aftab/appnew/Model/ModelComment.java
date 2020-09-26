package com.aftab.appnew.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelComment {

    @SerializedName("ok")
    @Expose
    private int ok;

    @SerializedName("msg")
    @Expose
    private String msg;

    @SerializedName("c")
    @Expose
    private obj_c c;

    public class obj_c {
        @SerializedName("ok")
        @Expose
        private int ok;

        @SerializedName("err")
        @Expose
        private int err;

        @SerializedName("des")
        @Expose
        private String des;
        @SerializedName("result")
        @Expose
        private List<Obj_Result> result =null;


        public List<Obj_Result> getResult() {
            return result;
        }

        public void setResult(List<Obj_Result> result) {
            this.result = result;
        }
    }


    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public obj_c getC() {
        return c;
    }

    public void setC(obj_c c) {
        this.c = c;
    }
}
