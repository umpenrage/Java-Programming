import java.util.EnumSet;

public class EnumTest{
	public static void main(String[] args){
		for(Book book : Book.values()){
			System.out.printf("%-10s%-45s%n%n", book, book.getTitle(), book.getYear());
		}
		System.out.printf("%nDisplay a range of enum constants:%n");

		for(Book book : Book.range(Book.JHTP, Book.CPPHTP)){
			System.out.printf("%-10s%-45s%n%n", book, book.getTitle(), book.getYear());
		}
	}
}