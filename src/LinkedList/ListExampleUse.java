package LinkedList;

public class ListExampleUse {
	
	private static final int[] sequence = {2, 3, 5, 12, 1, 6, 3};
	
	private LinkedList<Integer> sequenceList;
	
	public static void main(String args[]) {
		ListExampleUse obj = new ListExampleUse();
	}
	
	public ListExampleUse() {
		sequenceList = new LinkedList<Integer>();
		createList();
		display();
	}
	
	public void createList() {
		for(int i = 0; i < sequence.length; i++) {
			String str= "" + i;
			sequenceList.addLink(str, sequence[i]);
		}
	}

	public void display() {
		System.out.println(sequenceList.toString());
	}
}
