package javaapplication1;
public class Invoice{
	
	private String partNumber;
	private String partDescription;
	private int partQuantity;
	private double partPrice;

	public Invoice(String partNumber, String partDescription, int partQuantity, double partPrice){
		this.partNumber = partNumber;
		this.partDescription= partDescription;
		this.partQuantity = partQuantity;
		this.partPrice = partPrice;

	}	

	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;

	}
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;

	}
	public void setPartQuantity(int partQuantity){
		this.partQuantity = partQuantity;

	}
	public void setPartPrice(double partPrice){
		this.partPrice = partPrice;
	}
	public String getPartNumber(){
		return partNumber;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public int getPartQuantity(){
		return partQuantity;
	}
	public double getPartPrice(){
		return partPrice;
	}
	public double getInvoiceAmount(int quantity, double price){
		if(quantity > 0){
			this.partQuantity = quantity;
		}
		if(price >0.0){
			this.partPrice = price;
		}

		double invoiceAmount = quantity*price;
		return invoiceAmount;
	}
	
}