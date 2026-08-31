package LinkedList;

public class ProgramDrvier2 {
	public static void main(String[] args) {
		LinkedList2 ll = new LinkedList2();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.addindex(2, 50);
		ll.addindex(0, 5);
		ll.addAtBegin(80);
		ll.display();
		ll.deletefrombegin();
		
		ll.deleteAtIndex(1);
		ll.display();
		ll.deletefrombegin();
//		System.out.println("Length:"+length);
	}
}
