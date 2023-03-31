package com.mehkey.graphql.model;

import java.util.List;

public class BookContent {
    private List<Book> postList;

    public BookContent() {
        super();
    }
    public List<Book> getBookList() {
        return postList;
    }
    public void setBookList(List<Book> postList) {
        this.postList = postList;
    }
    @Override
    public String toString() {
        return "BookContentDTO [postList=" + postList + "]";
    }
}