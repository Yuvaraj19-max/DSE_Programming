package Dequeue;

public class DoublyendedQueue {
	Node font;
	Node rear;
	int length;
	public void fontenqueue(int data) {
		Node nn = new Node(data);
		if(font == null || rear == null) {
			font = rear = nn;
			return ;
		}
		font.prev = nn;
		nn.next = font;
		font = nn;
		length++;
	}
	
	public int fontpeek() {
		if(font == null) {
			return -1;
		}
		if(font == rear) {
			return font.data;
		}
		return font.data;
	}

	public int rearpeek() {
		if(rear == null) {
			return -1;
		}
		if(rear == font) {
			return rear.data;	
		}
		return rear.data;
	}

	public void rearenqueue(int data) {
		Node nn = new Node(data); 
		  if (rear == null) {
	            font = rear = nn;
	        } else {
	            rear.next = nn;
	            nn.prev = rear;
	            rear = nn;
	        }
	        length++;
	    }

	public void display() {
	if(font == null) {
		System.out.println("Dequeue is empty");
		return;
	}
	Node temp = font;
	System.out.println("Dequeue element: ");
	while(temp!=null) {
		System.out.print(temp.data+ " ");
		temp = temp.next;
	}
	System.out.println();
	}
	}
	
	
	
