package com.infin.shapecalculate.payload.response;


import java.io.Serializable;


public class Result implements Serializable {

    private String message;

    private boolean success;

    private Object data;

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public Result(String message, boolean success, Object o) {
        this.message = message;
        this.success = success;
        this.data = o;
    }

    public static Result ok(String message) {
        return new Result(message, true);
    }

    public static Result ok(Object o) {
        return new Result("Success", true, o);
    }

    public static Result deleted() {
        return new Result("Deleted", true);
    }

    public static Result deleted(boolean b) {
        return b ? new Result("Deleted", true) : new Result("Not deleted", false);
    }

    public static Result saved(Object obj) {
        return new Result("Saved", true, obj);
    }

    public static Result updated(Object obj) {
        return new Result("Updated", true, obj);
    }


}

