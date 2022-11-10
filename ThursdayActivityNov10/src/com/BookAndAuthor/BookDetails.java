package com.BookAndAuthor;

public class BookDetails {
	static void display(Book b) {
		System.out.println("Book Name : " + b.getBookName());
		System.out.println("Book Author name : " + b.getAur());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}

	public static void main(String[] args) {
		
		Book b1 = new Book("Story Books", 2020,199.00, new Author("abhishek", 23));
		display(b1);
	}

}

