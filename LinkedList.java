package dsa;

public class LinkedList {
	private Item first;
	
	public LinkedList() {
		first = null;
	}

	public void insertFirst(int no, double price) {
		Item i = new Item(no, price);
		i.next = first;
		first = i;
	}
	
	public void offerDiscount() {
		
		
		while()
	}
}
