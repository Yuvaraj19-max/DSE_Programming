package DoublyLinkedlist;

public class Problem1 {
public static void main(String[] args) {
	DoublyLinkedLIst2 dll = new DoublyLinkedLIst2();
	dll.addAtIndex(10);
	dll.addAtIndex(20);
	dll.addAtIndex(30);
	dll.addAtIndex(40);
	dll.addAtIndex(50);
	dll.addAtBegin(5);
	dll.addAtEnd(65);
	dll.addByIndex(2, 90);
	dll.display();
	
}
}
