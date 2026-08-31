package Queue;

public class Queue {
	Node font;
	Node rear;
	int length;
	
	public void enqueue(int data) {
		Node nn = new Node(data);
		if(rear == null) {
			font = rear = nn;
		}
		else {
			rear.next = nn;
			rear = nn;
		}
		length++;
		
	}

	public int dequeue() {
		if(font == null) {
			System.out.println("dequeue is empty");
			return -1;
		}
		 int val = font.data;
	        font = font.next;
	        if (font == null) {
	            rear = null; // queue became empty
	        }
	        length--;
	        return val;
	    }
		
	public int peek() {
		if(font == null) {
			System.out.println("queue is empty");
			return -1;
		}
		return font.data;
	}

	public void display() {
		if(font == null) {
			System.out.println("queue is empty");
			return;
		}
		Node temp = font;
		System.out.println("Queue element ");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
}
