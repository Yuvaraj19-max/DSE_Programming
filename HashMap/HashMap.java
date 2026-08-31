package HashMap;

public class HashMap {
	Node [] buckets;
	public HashMap(int size) {
		this.buckets = new Node[size];
	}
	public void put(int key, String value) {
		Node nn = new Node(key, value);
		int index = getIndex(key);
		Node head = buckets[index];
		if(head == null) {
			buckets[index] = nn;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			if(temp.key == key) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp.next = nn;
	}
	
	private int getIndex(int key) {	
		return key % buckets.length;
	}
	
	public String get(int key) {
		int index = getIndex(key);
		Node head = buckets[index];
		if(head == null) {
			return null;
		}
		
		Node temp = head;
		while(temp != null) {
			if(temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	
}
