package com.BookAndAuthor;

public class Book {
		private String bookName;
			private int yearOfPublication;
			private double price;
			private Author aur;
			
			public Book()
			{
				super();
			}

			public Book(String bookName, int yearOfPublication, double price, Author ar) {
				super();
				this.bookName = bookName;
				this.yearOfPublication = yearOfPublication;
				this.price = price;
				this.aur=(aur);
			}

			public String getBookName() {
				return bookName;
			}

			public void setBookName(String bookName) {
				this.bookName = bookName;
			}

			public int getYearOfPublication() {
				return yearOfPublication;
			}

			public void setYearOfPublication(int yearOfPublication) {
				this.yearOfPublication = yearOfPublication;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public Author getAur() {
				return aur;
			}

			public void setAur(Author aur) {
				this.aur = aur;
			}
}




	


