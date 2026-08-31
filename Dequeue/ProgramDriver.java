package Dequeue;

public class ProgramDriver {
public static void main(String[] args) {
	DoublyendedQueue dequeue = new DoublyendedQueue();
	dequeue.fontenqueue(10);
	dequeue.fontenqueue(30);
	dequeue.fontenqueue(60);
	dequeue.rearenqueue(40);
	dequeue.rearenqueue(50);
	dequeue.rearenqueue(20);
	dequeue.display();
	
	
//	System.out.println(dequeue.font.data);
	
	System.out.println(dequeue.fontpeek());
	System.out.println(dequeue.fontpeek());
	System.out.println(dequeue.rearpeek());
	System.out.println(dequeue.rearpeek());
	
	
}
}
