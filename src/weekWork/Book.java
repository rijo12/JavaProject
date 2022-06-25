package weekWork;

public class Book {

	String authorName;

	String title;

	int pageCount;

	Book(String author, String name, int pages) {

		authorName = author;

		title = name;

		pageCount = pages;

	}

	Book(){
		
		
	}
	
	String getauthor() {

		authorName = "ABC";

		return authorName;
	}

	String getName() {

		title = "ABCDEFG";

		return title;
	}
	int getPages() {
		
		pageCount= 100;
		
		return pageCount;
		
	}
}
