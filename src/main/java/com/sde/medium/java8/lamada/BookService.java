package com.sde.medium.java8.lamada;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBooksInSort() {
        List<Book> books = new BookDAO().getBooks();
       /* Collections.sort(books, new MyComparator());
        return books;*/
       /* Collections.sort(books, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/
        Collections.sort(books,(o1,o2)->
                o1.getName().compareTo(o2.getName()));
        return books;
    }

    public static void main(String[] args) {
        //System.out.println(new BookService().getBooksInSort());
        List<Book> sort = new BookService().getBooksInSort();
        System.out.println("sort: " + sort);
    }
}
   /* class MyComparator implements Comparator<Book> {

        public int compare(Book o1, Book o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }*/

