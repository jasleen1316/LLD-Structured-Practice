package com.jasleen.lld.medium.LibrarySystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class BookCatalog {

    private static final BookCatalog INSTANCE = new BookCatalog();
    private HashMap<String, Book> books;

    private BookCatalog(){
        books = new HashMap<>();
    }

    public static BookCatalog getCatalog(){
        return INSTANCE;
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }
}
