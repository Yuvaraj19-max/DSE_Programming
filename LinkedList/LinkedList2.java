package LinkedList;

public class LinkedList2 {
		Node head;
		int length;
		public void add(int data) {
			// TODO Auto-generated method stub
			Node nn = new Node(data);
			if(head == null) {
				head = nn;
				length++;
			    return;
			}
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			temp.next = nn;
			length++;
		}
		
		public void display() {
			Node temp = head;
		 while(temp != null) {
			 System.out.print(temp.data+"->"); 
			 temp = temp.next;
		 }
		 System.out.println("null");
			
		}

		public void addindex(int index, int data) {
			Node nn = new Node(data);
			if(index < 0 || index > length) {
				System.out.println("INValid Index");
				return;
			}
			if(index == 0) {
				Node temp = head;
				head = nn;
				nn.next = temp;
				length++;
				return;
			}
			Node temp = head;
			for(int i = 0;i<index-1 ; i++ ){
				temp = temp.next;
			}
			Node tempnext = temp.next;
			temp.next = nn;
			nn.next = tempnext;
			length++;
			}

		public void addAtBegin(int data) {
			// TODO Auto-generated method stub
			Node nn = new Node(data);
			if(head == null) {
				head = nn;
				length++;
				return;
			}
			Node temp  = head;
			head = nn;
			nn.next = temp;
			length++;
		}

		public void deletefrombegin() {
			// TODO Auto-generated method stub
			if(head == null) {
				System.out.println("list is empty");
				return;
			}
			Node temp = head;
			head = head.next;
			temp.next = null;
			length--;
		}

		public void deleteAtIndex(int index) {
			if(index < 0 || index >= length) {
				System.out.println("Invalid Index");
				return;
			}
			if(index == 0) {
				deletefrombegin();
				return;
			}
			Node temp  = head;
			for(int i = 1; i < index; i++) {
				temp = temp.next;
			}
			Node tempnext = temp.next.next;
			int eledeleted = temp.next.data;
			temp.next.next = null;
			temp.next = tempnext;
			length++;
			System.out.println("Deleted: "+eledeleted);
		}
		
		
}
