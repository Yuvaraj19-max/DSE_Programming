package FunctionalInterface;

public class ProgramDriver {
public static void main(String[] args) {
	calci c1 = new calci() {


		public void add(int a, int b) {
			System.out.println(a+b);
		}


		public void sub(int a, int b) {
		System.out.println(a - b);
		}
	};
	
	System.out.println(c1);
	c1.add(20, 10);
	c1.sub(20, 60);
}
}
