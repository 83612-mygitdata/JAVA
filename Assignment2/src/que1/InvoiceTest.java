package que1;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice();
		in.setPart_num("MH09");
		in.setPart_desc("tyre");
		in.setQuantity(10);
		in.setPrice(20);
		
		String part_num=in.getPart_num();
		String part_desc=in.getPart_desc();
		int quantity=in.getQuantity();
		double price=in.getPrice();
		
		System.out.println("Part number is : "+part_num);
		System.out.println("Part description : "+part_desc);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price per item is : "+price);
		in.CalcAmount(quantity, price);

	}

}
