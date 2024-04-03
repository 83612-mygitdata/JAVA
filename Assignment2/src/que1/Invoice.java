/*
 Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 */

package que1;

public class Invoice {
	private String part_num;
	private String part_desc;
	private int quantity;
	private double price;
	
	public Invoice()
	{
		
	}
	public Invoice(String part_num,String part_desc,int quantity,double price)
	{
		this.part_num=part_num;
		this.part_desc=part_desc;
		this.quantity=quantity;
		this.price=price;
	}
	public void setPart_num(String part_num)
	{
		this.part_num=part_num;
	}
	public void setPart_desc(String part_desc)
	{
		this.part_desc=part_desc;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getPart_num()
	{
		return part_num;
	}
	public String getPart_desc()
	{
		return part_desc;
	}
	public int getQuantity()
	{
		if(quantity<0)
		{
			return 0;
		}
		else
		{
			return quantity;
		}
	}
	public double getPrice()
	{
		if(price<0)
		{
			return 0.0;
		}
		else
		{
			return price;
		}
	}
	
	public void CalcAmount(int quantity,double price)
	{
		double amt;
		amt=quantity*price;
		System.out.println("Total amount is : "+amt);
	}
	}
