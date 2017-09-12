package javaapplication1;
import java.util.Scanner;
public class InvoiceTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the part number, part description, price, and quanity");
		String number = input.nextLine();
                System.out.println("Description");
		String description = input.nextLine();
		System.out.println("Price");
                double price = input.nextDouble();
		input.nextLine();
                System.out.println("Quantity");
		int quantity = input.nextInt();
		input.nextLine();
		Invoice myInvoice = new Invoice(number, description, quantity, price);
		System.out.println("\t\t INVOICE\n");
		System.out.printf("%-17s \t %s%n", "Part Number", myInvoice.getPartNumber());
		System.out.printf("%-17s \t %s%n", "Part Description", myInvoice.getPartDescription());
		System.out.printf("%-17s \t %,.2f%n", "Price", myInvoice.getPartPrice() );
		System.out.printf("%-17s \t %,d%n", "Quantity", myInvoice.getPartQuantity());
		System.out.println();
		System.out.printf("%17s \t %,.2f%n", "Total", myInvoice.getInvoiceAmount(quantity, price));
	}
}