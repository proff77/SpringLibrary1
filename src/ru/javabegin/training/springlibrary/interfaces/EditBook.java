package ru.javabegin.training.springlibrary.interfaces;

import ru.javabegin.training.springlibrary.objects.Book;

public interface EditBook {

    void save(Book book);
    void delete(Book book);
    void edit(Book book);
    void add(Book book);
}
