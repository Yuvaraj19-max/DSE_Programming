package DoublyLinkedlist;

import LinkedList.Node;

public class DoublyLinkedlist {
	Node head;
	Node tail;
	int length;
	
	public void addAtEnd(int data) {
		Node nn =  new Node(data);
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

	public void addAtBegin(int data) {
	    Node nn = new Node(data);
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


	public void addAtIndex(int index, int data) {
		if(index < 0 || index > length) {
			System.out.println("Invalid index");
			return;
		}
		if(index == 0 ){
			addAtBegin(data);
			return;
		}
		if( index == length){
			addAtEnd(data);
			return;
		}
		Node nn = new Node(data);
		Node temp = head;
		for(int i = 1;i< index;i++) {
			temp = temp.next;
			}
			nn.prev = temp;
			nn.next = temp.next;
			nn.next.prev = nn;
			temp.next = nn;
			length++;
		}
	
	
		public void display() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
		}
		
		public void deletefrombegin() {
		if(head == null) {
		System.out.println("list is empty");
		return;
			}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
			}
		
		
		public void deletefromend() {
			if(head == null) {
			System.out.println("list is empty");
			return;
			}
						
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node templast = temp;
		templast.next= null;
		length--;
		}
		
		public void deleteatindex(int index) {
		if(index < 0 || index >= length) {
			System.out.println("Invalid Index");
						return;
			}
			if(index == 0) {
			deletefrombegin();
			return;
			}
			Node temp = head;
			for(int i = 1;i<index;i++) {
			temp = temp.next;
			}
			Node tempnext = temp.next.next;
			int eleDeleted = temp.next.data;
			temp.next = tempnext;
			length--;
			System.out.println("delete element is : "+eleDeleted);
		}			
}


