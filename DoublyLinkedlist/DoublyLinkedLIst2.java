package DoublyLinkedlist;

import LinkedList.Node2;

public class DoublyLinkedLIst2 {
	Node2 head;
	Node2 tail;
	int length;
	
	public void addAtIndex(int data) {
		Node2 nn = new Node2(data);
		if(head == null && tail == null) {
			head = tail = nn;
			length++;
		}
		nn.prev = tail;
		tail.next = nn;
		tail = nn;
		length++;
	}
	public void addAtBegin(int data) {
	    Node2 nn = new Node2(data);
	    if (head == null && tail == null) {
	        head = tail = nn;
	        length++;
	        return;
	    }
	    nn.next = head;
	    head.prev = nn;
	    head = nn;
	    length++;
	}
	
	public void addAtEnd(int data) {
		Node2 nn =  new Node2(data);
		if( head == null && tail == null) {
			head = tail = nn;
			length++;
			return;
		}
		nn.prev = tail;
		tail.next = nn;
		tail = nn;
		length++;
	}

	public void display() {
		Node2 temp = head;
		while(temp != null){
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.println("null");	
	}
		
	public void addByIndex(int index,int data) {
		if(index < 0 || index > length) {
			System.out.println("invalid index");
			return;
		}
		if(index == 0) {
			addAtBegin(data);
			return;
		}
		if(index == length) {
			addAtEnd(data);
			return;
		}
		Node2 nn = new Node2(data);
		Node2 temp = head;
		for(int i = 0;i<index;i++) {
			temp = temp.next;
		}
		nn.prev = temp;
		nn.next = temp.next;
		nn.next.prev = nn;
		temp.next = nn;
		length++;	
	}
	
	
	
	
}
