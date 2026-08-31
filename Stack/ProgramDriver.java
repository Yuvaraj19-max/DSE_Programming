package Stack;

public class ProgramDriver {
public static void main(String[] args) {
	Stack stack = new Stack();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
//	stack.pop(40);
//	stack.pop(30);
//	stack.pop(20);
	System.out.println(stack.peek());

	System.out.println(stack.head.data);
}
}
