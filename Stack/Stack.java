package Stack;

import java.util.EmptyStackException;

public class Stack {
	Node head;
	int length;
	public void push(int data) {
		Node nn = new Node(data);
		if(head == null) {
			head  = nn;
			length++;
			return;
		}
		nn.next = head;
		head = nn;
		length++;
	}
	
	public void pop(int data) {
		if(head == null) {
			throw new EmptyStackException();
		}
		Node temp = head;
		head = head.next;
		temp.next =null;
		length--;
	}

	public int peek() {
		if(head == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		return head.data;
	}
	
}
