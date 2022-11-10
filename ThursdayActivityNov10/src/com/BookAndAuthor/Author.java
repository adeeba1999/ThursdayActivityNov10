package com.BookAndAuthor;

public class Author {

		public String authorname;
		public int age;
		
		public Author()
		{
			super();
		}
		public Author(String authorName,int age)
		{
			this.authorname=authorname;
			this.age=age;
		}
		
		
		public String getAuthorname() {
			return authorname;
		}
		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String toString() {
			return authorname+ "  Age  : " + age;
		}

		

	}

