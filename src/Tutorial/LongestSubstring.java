package Tutorial;

public class LongestSubstring {

	public static void main(String[] args) {
		int len = lengthOfLongestSubstring(" ");
		System.out.println(len);
	}

	public static int lengthOfLongestSubstring(String s) {

		// checking if s=""
		if (s.length() == 0) {
			return 0;
		}

		String currentLongest = "";
		String maxLongest = "";
		for (int i = 0; i < s.length(); i++) {

			// if string is present in currentLongest
			int indexOfPresentChar = currentLongest.indexOf(s.substring(i, i + 1));
			if (indexOfPresentChar >= 0) {
				currentLongest = currentLongest.substring(indexOfPresentChar+1);
			}
			currentLongest += s.substring(i, i + 1);
			if (currentLongest.length() > maxLongest.length()) {
				maxLongest = currentLongest;
			}
		}
		System.out.println(currentLongest);
		System.out.println(maxLongest);
		return maxLongest.length();

	}
}
