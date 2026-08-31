package practise;

public class ProgramDriver {
public static void main(String[] args) {
	
	MyStacks stacks = new MyStacks();
	stacks.visit("FilpKart");
	stacks.visit("Amazon");
	stacks.visit("Myntra");
	
//	System.out.println(stacks.CurrentStackhead.data);
	System.out.println(stacks.reload());
	stacks.back();
	System.out.println(stacks.reload());
}
}
