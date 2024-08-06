package Tutorial;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		//creating default HashMap
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		
		//Creating custom map
		Map<Integer, String> map2 = new HashMap<>(20, 0.6f);
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3,  "three");
		
//		System.out.println(map.size() + "\n"+ map.toString());
//		System.out.println(map2.size() + "\n" + map2.toString());
		
		String i = "Tapas";
		System.out.println(i.hashCode());
	}
}
