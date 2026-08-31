package Queue;

public class ProgramDriver {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.display();
		
		System.out.println(q.peek());
		
		System.out.println(q.font.data);
		System.out.println(q.font.next.data);
		System.out.println(q.font.next.next.data);
	}
}
