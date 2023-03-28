package com.mehkey.graphql.DTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mehkey.graphql.model.BookComment;

//import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private;

public class BookDTO {

    private Long id;

    private String name;

    private String author;

    private String description;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
