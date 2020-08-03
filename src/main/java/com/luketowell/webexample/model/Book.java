package com.luketowell.webexample.model;

import java.util.Set;

public class Book {
    private String title;
    private String ispn;
    private Set<Author> Authors;

    public Book() {
    }

    public Book(String title, String ispn, Set<Author> authors) {
        this.title = title;
        this.ispn = ispn;
        Authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIspn() {
        return ispn;
    }

    public void setIspn(String ispn) {
        this.ispn = ispn;
    }

    public Set<Author> getAuthors() {
        return Authors;
    }

    public void setAuthors(Set<Author> authors) {
        Authors = authors;
    }
}
