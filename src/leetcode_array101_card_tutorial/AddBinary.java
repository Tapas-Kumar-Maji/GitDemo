package leetcode_array101_card_tutorial;

public class AddBinary {

	public String addBinary(String a, String b) {
		// binary to digits
		int sum = binaryToDigits(a) + binaryToDigits(b);

		// digit to binary
		int binary = 1;
		while (sum > 0) {
			binary = binary * 10 + sum % 2;
			sum /= 2;
		}

		// reverse
		int num = 0;
		while (binary != 1) {
			num = num * 10 + binary % 10;
			binary /= 10;
		}

		return num + "";
	}

	public int binaryToDigits(String str) {
		int p = 0, sum = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			sum += (str.charAt(i) - '0') * Math.pow(2, p++);
		}
		return sum;
	}

	public static void main(String[] args) {
		AddBinary obj = new AddBinary();
		System.out.println(obj.addBinary("1110001", "110100100"));
	}
}
