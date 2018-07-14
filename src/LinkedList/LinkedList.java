package LinkedList;

public class LinkedList<T> {
	
	public Link<T> first;
	
	public void addLink(String name, T data) {
		
		Link<T> link = new Link<T>(name, data);
		
		if(isEmpty()) {
			first = link;
		} else {
			link.next = first;
			first = link;
		}
	}
	
	public Link<T> removeFirst() {
		Link<T> ref = first;
		
		if(!isEmpty()) {
			first = first.next;
		} else {
			System.out.println("LinkedList is empty");
		}
		
		return ref;
	}
	
	public boolean isEmpty() {
		
		if(first == null) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		String str= "";
		
		Link<T> ref = first;
		
		while(ref.next != null) {
			str += ref.toString();
			str += ", ";
			ref = ref.next;
		}
		str += ref.toString();
		
		//System.out.println(str);
		return str;
	}
	
}
