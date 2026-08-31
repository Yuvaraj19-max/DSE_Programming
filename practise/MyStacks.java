package practise;

public class MyStacks {

Node CurrentStackhead;
Node HistoryStackhead;
public void visit(String data) {
			Node nn = new Node(data);
		if(CurrentStackhead == null) {
			CurrentStackhead = nn;
			return;
		}
		nn.next = CurrentStackhead;
		CurrentStackhead = nn;
}

public String reload() {
	if(CurrentStackhead == null) {
		return null;
	}
	return CurrentStackhead.data;
}


public void back() {
	if(CurrentStackhead == null) {
		return;
	}
	Node temp = CurrentStackhead;
	CurrentStackhead = temp.next;
	temp.next = null;
	
	if(HistoryStackhead == null) {
		HistoryStackhead = temp;
		return;
	}
	temp.next = HistoryStackhead;
	HistoryStackhead = temp;
}

}
