/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21oopproba;

import myclasses.Author;
import myclasses.Book;
import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Book book = createBook("Jevgeny Onegin");
        book.addAuthor(createAuthor("Aleksandr","Pushkin"));
        Book book1 = createBook("13 stuljev");
        book.addAuthor(createAuthor("Aleksandr","Pushkin"));
        book.addAuthor(createAuthor("Ila","Ilf"));
        Book book2 = createBook("Otsi i dety");
        book.addAuthor(createAuthor("Ivan","Turgemev"));
        Book book3 = createBook("Ruslan i Ludmilla");
        book.addAuthor(createAuthor("Aleksandr","Pushkin"));
        Book book4 = createBook("Lerning Java EE 7");
        book.addAuthor(createAuthor("Andrea","Gonsalves"));
        Book[] books = {book, book1,book2,book3,book4};
        
        System.out.println(Arrays.toString(books));
            
    }
    private Book createBook(String caption){
        Book book = new Book();
        book.setCaption(caption);
        return  book;
    }
    private Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    
}
