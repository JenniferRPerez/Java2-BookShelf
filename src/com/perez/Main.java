package com.perez;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi!");

        



        Book b1 = new Book("Java Generics", "Jenny");
        Book b2 = new Book("Java Collections", "Jenny");
        Book b3 = new Book("Java Collections", "Austin");
        Book b4 = new ChildrensBook("Java for Kids", "Your Name", "Your Partner's Name");
    }
}
