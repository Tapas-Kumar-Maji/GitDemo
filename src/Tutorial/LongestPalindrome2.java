package Tutorial;

public class LongestPalindrome2 {
	public String longestPalindrome(String s) {
		if(s.length() <= 1) {
			return s;
		}
		
		String currentStr = "";
		int currentStrLen = 0;
		String longestPalin = "";
		int maxLen = 1;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+maxLen; j<s.length(); j++) {
				
				currentStr = s.substring(i,j+1); 
				currentStrLen = currentStr.length();
				if(isPalindrome(currentStr) && currentStrLen>=maxLen) {
					maxLen = currentStrLen;
					longestPalin = currentStr;
				}
			}
		}
		return longestPalin;
	}

	boolean isPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LongestPalindrome2 obj = new LongestPalindrome2();
		System.out.println(obj.longestPalindrome("abba"));
	}
}
