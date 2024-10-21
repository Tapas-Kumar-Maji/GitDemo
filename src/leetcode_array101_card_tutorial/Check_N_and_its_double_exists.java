package leetcode_array101_card_tutorial;

public class Check_N_and_its_double_exists {

	public static void main(String[] args) {
//		System.out.println(checkIfExist(new int[] { 7, 1, 14, 11 }));
		int[] result = sortArrayByParity(new int[] { 3, 1, 2, 4 });
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static boolean checkIfExist(int[] arr) {
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i] * 2 == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

	public static int[] sortArrayByParity(int[] nums) {

		int start = 0, end = nums.length - 1;
		while (start < end) {
			if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
			if (nums[start] % 2 == 0) {
				start++;
			}
			if (nums[end] % 2 != 0) {
				end--;
			}
		}
		return nums;
	}
}
