
public class Factoiral {
	public static int fact(int num) {
	if(num == 1 || num == 0) {
		return 1;
	}
	int res = num * fact(num-1);
	return res;
	}
	
public static void main(String[] args) {
	int Factoiral = fact(5);
	System.out.println(Factoiral);
}
}
