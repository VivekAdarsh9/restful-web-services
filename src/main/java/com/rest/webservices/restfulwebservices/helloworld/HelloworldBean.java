package com.rest.webservices.restfulwebservices.helloworld;

public class HelloworldBean {
    private String message;

    public HelloworldBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // @Override
    // public String toString() {
    // return "HelloworldBean [message=" + message + "]";
    // }

    public String getMessage() {
        return message;
    }

}
