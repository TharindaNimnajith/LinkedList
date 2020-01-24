package dsa;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	
	public void insertAfter(int key, int newData) {
		Link l = new Link(newData);
		
		l.next = find(key).next;
		find(key).next = l;
	}
	
	//public void insertLast() {}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link deleteAfter(int key) {
		Link current = first;
		Link previous = first;
		
		while(current != null) {
			if(current.iData == key) {
				if(current == first) {
					first = first.next;
				}
				else {
					previous.next = current.next;
				}
				
				return current;
			}
			else {
				previous = current;
				current = current.next;
			}
		}
		
		return null;
	}
	
	//public Link deleteLast() {}
	
	public Link find(int key) {
		Link current = first;
		
		while(current != null) {
			if(current.iData == key) {
				//found
				return current;
			}	
			else {
				current = current.next;
			}	
		}
		
		//not found
		return null;
	}
	
	public void displayList() {
		Link current = first;
		
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public boolean isEmpty() {
		if(first == null)
			return true;
		else
			return false;
	}
}
