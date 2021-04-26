package com.books;

public class BookArray {

	public static void main(String[] args) {

		// Creating Book array which stores Fiction and Non-Fiction Book Objects
		Book bookArray[] = { new Fiction("Nineteen Eighty-Four "), new Fiction("The Handmaid's Tale"),
				new Fiction("The Great Gatsby"), new Fiction("Pride and Prejudice"),
				new Fiction("The Catcher in the Rye"), new NonFiction("The Story of Silent Spring "),
				new NonFiction("Between the World and Me"), new NonFiction("Black Boy"),
				new NonFiction("In Cold Blood"), new NonFiction("Meditations") };

		// This for loop will displays the Each Fiction and Non-Fiction book details
		for (int i = 0; i < bookArray.length; i++) {
			// Displaying the information of each book
			System.out.println(bookArray[i].toString());
		}
	}

}
