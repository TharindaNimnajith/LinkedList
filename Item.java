package dsa;

public class Item {
	public int itemNo;
	public double unitPrice;
	
	public Item next;
	
	public Item(int itemNo, double unitPrice) {
		this.itemNo = itemNo;
		this.unitPrice = unitPrice;
		
		next = null;
	}
	
	public void displayItem() {
		System.out.println(itemNo + " " + unitPrice);
	}
}
