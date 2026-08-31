package LinkedList;

public class ProgramDriver {
	 public static void main(String[] args){
		    Linkedlist ll = new Linkedlist();
		        ll.add(10);
		        ll.add(20);
		        ll.add(30);
		        ll.add(40);
		        ll.add(50);
		        System.err.println(ll.head.data);
		        System.err.println(ll.head.next.data);
		        System.err.println(ll.head.next.next.data);
		        System.err.println(ll.head.next.next.next.data);
		    }
}
