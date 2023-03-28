package com.mehkey.graphql.DTO;

import java.util.List;
import com.graphql.response.CommonResponse;

public class BookContentDTO extends CommonResponse{
    private List<BookDTO> postList;

    public BookContentDTO() {
        super();
    }
    public List<BookDTO> getBookList() {
        return postList;
    }
    public void setBookList(List<BookDTO> postList) {
        this.postList = postList;
    }
    @Override
    public String toString() {
        return "BookContentDTO [postList=" + postList + "]";
    }
}