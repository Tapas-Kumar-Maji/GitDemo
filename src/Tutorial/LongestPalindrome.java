package Tutorial;

public class LongestPalindrome {
	public String longestPalindrome(String s) {

		if (s.length() == 1)
			return s;

		String longestPalindrome = "";
		String str;
		for (int i = 0; i < s.length() - 1; i++) {
			str = "";
			for (int j = i; j < s.length(); j++) {
				str += s.charAt(j);

				if (str.equals(palindrome(str)) && str.length() > longestPalindrome.length()) {
					longestPalindrome = str;
					System.out.println("longestPalindrome : " + longestPalindrome);
				}
			}
		}
		return longestPalindrome;
	}

	public static String palindrome(String s) {

		String reversedString = "";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			reversedString = ch + reversedString;
		}
		System.out.println("reversedString :" + reversedString);
		return reversedString;
	}

	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		String s = lp.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
		System.out.println(s);
	}
}
