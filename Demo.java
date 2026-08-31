
public class Demo {
	
	public static void print(int a) {
		if(a == 0) {
			return;
		}
		System.out.println("HELLO");
		a = a - 1;
		print(a);
		System.out.println("hi");
	}
	
public static void main(String[] args) {
	print(5);
}
}
