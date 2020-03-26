package com.freshworks.com.domain;

public class LoggingService
{

    private final long id;
    private final String content;

    public LoggingService(long id, String content) {
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
