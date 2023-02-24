package com.sde.medium.java8.lamada;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books=new ArrayList<Book>();
        books.add(new Book(1, "Java 8 in Action",60));
        books.add(new Book(2, "Hava9",70));
        books.add(new Book(3, "Dava10",70));
        books.add(new Book(4, "Bava11",70));
        return books;

    }
}
