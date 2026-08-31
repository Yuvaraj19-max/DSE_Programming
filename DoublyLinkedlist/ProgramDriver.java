package DoublyLinkedlist;

public class ProgramDriver {
public static void main(String[] args) {
	DoublyLinkedlist dll = new DoublyLinkedlist();
	dll.addAtEnd(10);
	dll.addAtEnd(20);
	dll.addAtEnd(30);
	dll.addAtEnd(40);
	dll.addAtBegin(5);
	dll.addAtIndex(2,45);
	dll.display();
	dll.deletefrombegin();
	dll.deleteatindex(3);
	dll.deletefromend();
	System.out.println(dll.head.next.next.data);
	System.out.println("Lenght: "+dll.length);
}
}
