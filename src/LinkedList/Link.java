package LinkedList;

public class Link<T> {
	
	public String name;
	public T data;
	
	public Link<T> next;
	
	
	public Link(String name, T data) {
		this.name = name;
		this.data = data;
	}
	
	public void display() {
		System.out.println(name + ", " + data.toString());
	}
	
	public String toString() {
		return "name: " + name + " " + "contents: " + data.toString();
	}
}
