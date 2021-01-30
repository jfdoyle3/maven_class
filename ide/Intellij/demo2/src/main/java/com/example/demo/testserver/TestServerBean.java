package com.example.demo.testserver;
public class TestServerBean {

    private String message;

    public TestServerBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("TestServerBean [message=%s]", message);
    }

}
