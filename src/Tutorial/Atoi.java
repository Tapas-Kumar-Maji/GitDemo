package Tutorial;

public class Atoi {
	int result = 0;

	public int myAtoi(String s) {
		int length = s.length();
		int i = 0;
		int ans = 0;
		int sign = 1;
		int digit;

		if (length == 0) {
			return 0;
		}

		// ignoring leading whitespaces
		while (i < length && s.charAt(i) == ' ') {
			i++;
		}

		// finding sign
		while (i < length && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
			if (s.charAt(i) == '-') {
				sign = -1;
			}
			i++;
		}

		// finding the digits
		while (i < length && s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' >= 0) {
			digit = s.charAt(i) - '0';
			System.out.println(digit);
			System.out.println(ans);
			// checking overflow
			if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			ans = ans * 10 + digit;
			i++;
		}

		return ans * sign;
	}	

	public static void main(String[] args) {
		Atoi obj = new Atoi();
		int value = obj.myAtoi("+-12");
		System.out.println("Value :" + value);

	}
}
