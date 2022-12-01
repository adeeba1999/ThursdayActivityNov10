package com.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookStore {

	public static void main(String[] args) {
		List<Book>b=new ArrayList<Book>();
		b.add(new Book("A better India","Narayana Murthy",280.0));
		b.add(new Book("War and Peace","leo tolstoy",1500.0));
		b.add(new Book("Blind Beauty","Boris Pasternak",895.0));
		b.add(new Book("Broken Wings","Sarojini naidu",659.0));
		b.add(new Book("Crime and punishment","Dostoevsky",5000.0));
		System.out.println("The Books in BookStore are:");
		
		//Dispaly all books details 
		for(Book b1:b)
		{
			
			System.out.println(b1.title+","+b1.author+","+b1.price);
		}
		System.out.println("-----------------------------------------");
		
		//Book search by title
		
			System.out.println("Enter title of the book ");
			Scanner s=new Scanner(System.in);
			String t=s.next();
			for(Book b2:b)
			{
			if(b2.title.contains(t))
			{
			System.out.println("Book is avialable and details are:");
			System.out.println(b2.title+","+b2.author+","+b2.price);
		    }
			/*else
			{
				System.out.println("Book is not available in the bookstore");
			}*/
		}
       System.out.println("-----------------------------------------");
		
		//Book search by author
       System.out.println("Enter Author of the book ");
		Scanner s1=new Scanner(System.in);
		String au=s1.next();
		for(Book b3:b)
		{
			if(b3.author.contains(au))
			{
				System.out.println("Book is avialable and details are:");
			   System.out.println(b3.title+","+b3.author+","+b3.price);
		   }
			/*else
			{
				System.out.println("Book is not available in the bookstore");
			
		    }*/
		}

	}

}


