/**
 * Karyme Flores 
 */


import java.util.Scanner; 

public class Calculator {

	public static void main(String[] args) {
		 
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println( "Welcome to the Stock Calculator."); 
		System.out.print("Please enter your name:    ");
		String name = kb.nextLine();
		System.out.print("\n\nHello " + name + ", welcome to the Stock Calculator.");
		System.out.println("Please press enter to continue");
		kb.nextLine(); 
		System.out.print("Please enter number of shares purchased:   ");
		String shares = kb.nextLine(); 
		System.out.print("Please enter price per share of stocks purchased: "); 
		String pricepur = kb.nextLine(); 
		System.out.print("Please enter commission rate for purchase to"
				+ " be paid to stock broker (as a decimal):" );
		String commpur = kb.nextLine(); 
		System.out.print("Please enter price per share that the stocks were sold for:   ");
		String pricesold = kb.nextLine(); 
		System.out.print("Please enter commission rate to be paid "
				+ "to the stockbroker for the sale (as a decimal):  ");
		String commsale = kb.nextLine();
		
		int shares1 = Integer.parseInt(shares); 
		double pricepur1 = Double.parseDouble(pricepur); 
		double commpur1 = Double.parseDouble(commpur); 
		double pricesold1 = Double.parseDouble(pricesold); 
		double commsale1 = Double.parseDouble(commsale); 
		
		System.out.println("Shares purchased:   " + shares1); 
		System.out.println("Price per share:   " + pricepur1); 
		System.out.println("Commission rate on purchase:  " + commpur1); 
		System.out.println("Sale price per share:   " + pricesold1); 
		System.out.println("Commission rate on sale:   " + commsale1); 
		
		double totalpaid = shares1* pricepur1; 
		double commpurchase = totalpaid* commpur1; 
		double totalsale = shares1* pricesold1; 
		
		double commsold = totalsale* commsale1;
		double net = totalsale - totalpaid - commpurchase - commsold; 
		
		System.out.println("Total paid for " + shares1 +" shares:   " + totalpaid); 
		System.out.println("Commission on purchase: " + commpurchase ); 
		System.out.println("Total sale price for " + shares1 + " shares:  " + totalsale );
		System.out.println("Commission on sale:   " + commsold  ); 
		System.out.println("Net gain/loss:  " + net); 
		
		
		
		
		
		
		
		

	}

}
