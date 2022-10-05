/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class JPTV21OopProba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin");
        Book book = new Book();
        book.setCaption("Jevgeny Onegin");
        Author[] authors = new Author[1];
        authors[0] = author1;
        book.setAuthors(authors);
        System.out.println(book.toString());
        
        Book book2 = new Book();
        book2.setCaption("Zolotoy teljenok");
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Jevgeny");
        author3.setLastname("Petrov");
        Author[] authors2 = new Author[2];
        authors2[0]=author2;
        authors2[1]=author3;
        book.setAuthors(authors2);
        System.out.println(book2.toString());
        System.out.println("-----------------------");
        Book book3 = new Book();
        book3.setCaption("Vqmeslennaja kniga");
        Author author4 = new Author();
        author4.setFirstname("Aleksandra");
        author4.setLastname("Gorbunova");
        Author author5 = new Author();
        author5.setFirstname("Artem");
        author5.setLastname("Karpov");
        Author author6 = new Author();
        author6.setFirstname("Andrei");
        author6.setLastname("Lubnin");
        Author[] authors3 = new Author[3];
        authors3[0] = author4;
        authors3[1] = author5;
        authors3[2] = author6;
        book3.setAuthors(authors3);     
        System.out.println(book3.toString());
        System.out.println("-------------------------");
        Book newbook = new Book();
        newbook.setCaption("kniwka moja");
        newbook.addAuthor(author3);
        System.out.println(newbook.toString());
    
    }
    
}
