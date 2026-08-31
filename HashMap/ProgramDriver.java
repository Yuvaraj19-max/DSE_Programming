package HashMap;

public class ProgramDriver {
public static void main(String[] args) {
	HashMap map = new HashMap(5);
	map.put(101,"Allen");
	map.put(102,"Kvien");
	map.put(103,"Smith");
	map.put(107,"Amith");
	map.put(106,"Ankit");
	map.put(108,"Badam");
	
System.out.println(	map.get(106));
//	System.out.println(map.buckets.length);
//	System.out.println(map.buckets[1].key);
//	System.out.println(map.buckets[1].value);
	
}
}
