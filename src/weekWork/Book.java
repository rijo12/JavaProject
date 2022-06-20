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
	
	String getauthor(String author) {

		authorName = author;

		return authorName;
	}

	String getName(String bookName) {

		title = bookName;

		return title;
	}
	int getPages(int page1) {
		
		pageCount= page1;
		
		return pageCount;
		
	}
}
