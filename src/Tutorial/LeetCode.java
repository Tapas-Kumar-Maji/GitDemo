package Tutorial;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {

	public static void main(String[] args) {
		String str = "leetcode";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) == null) {
				map.put(ch, i);
			}

		}
		
		System.out.println("Whats up?");

	}

}
