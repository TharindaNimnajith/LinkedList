package dsa;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		/*Link l1 = new Link(120);
		Link l2 = new Link(17);
		Link l3 = new Link(35);
		
		l1.next = l2;
		l2.next = l3;*/
		
		/*LinkList list = new LinkList();
		
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		
		list.displayList();
		
		while(!list.isEmpty()) {
			Link temp = list.deleteFirst();
			System.out.println(temp.iData);
		}*/
		
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Item No: ");
			int no = sc.nextInt();
			
			System.out.print("Unit Price: ");
			double price = sc.nextDouble();
			
			System.out.println();
			
			l.insertFirst(no, price);
		}
	}
}
