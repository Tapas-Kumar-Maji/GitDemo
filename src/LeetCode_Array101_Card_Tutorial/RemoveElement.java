package LeetCode_Array101_Card_Tutorial;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = { 2 }; // { 0, 1, 2, 2, 3, 0, 4, 2 };
		int len = removeElement(arr, 3);
		System.out.println(len);
	}

	public static int removeElement(int[] nums, int val) {
		// edge case
//		if(nums.length == 1) {
//			if(nums[0] == val) {
//				nums = new int[0];
//				return 0;
//			}
//
//		}

		// normal code.
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			if (nums[left] == val && nums[right] != val) {
				nums[left++] = nums[right];
				nums[right--] = val;
			} else if (nums[left] == val && nums[right] == val) {
				nums[right--] = val;
			} else if (nums[left] != val) {
				left++;
			}
		}

		if (right <= 0 && left == 0) {
			nums = new int[0];
			return 0;
		}

		for (int a : nums) {
			System.out.print(a + " ");
		}

		System.out.println();
		return left;
	}
}
