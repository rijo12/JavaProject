package weekWork;

public class BookMain {

	public static void main(String[] args) {

		Book bookConstructor = new Book("ABC", "ABCDE", 50);

		Book authorReturn = new Book();

		System.out.println(authorReturn.getauthor("CDE"));

		Book titleReturn = new Book();

		System.out.println(titleReturn.getName("GGG"));

		Book pageReturn = new Book();

		System.out.println(pageReturn.getPages(100));

	}

}
