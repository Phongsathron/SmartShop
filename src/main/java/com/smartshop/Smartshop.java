package com.smartshop;

public class Smartshop {
    private final long id;
    private final String content;

    public Smartshop(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
