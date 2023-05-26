package com.example.demo;

import com.example.demo.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(1l);
        book1.setTitle("lap trinh web");
        book1.setAuthor("Anh");
        book1.setPrice(10.99);
        book1.setCategory("cong nghe thong tin");
        books.add(book1);
        Book book2 = new Book();
        book2.setId(2l);
        book2.setTitle("lap trinh ung dung");
        book2.setAuthor("huy");
        book2.setPrice(12.99);
        book2.setCategory("cong nghe thong tin");
        books.add(book2);
        return books;

    }

}
