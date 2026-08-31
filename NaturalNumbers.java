
public class NaturalNumbers{

	public static  void number(int num) {
		if(num == 0) {
			return;
		}
		System.out.println(num);
		num = num - 1;
		number(num);
	}
	public static void main(String[] args) {
		number(10);
	}
}
