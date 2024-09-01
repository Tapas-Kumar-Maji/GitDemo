package LeetCode_Array101_Card_Tutorial;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		merge(nums1, 3, nums2, 3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

//      nums1 and nums2, sorted in ascending order,
//      nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

		if (n == 0) {
			return;
		}

		int totalLength = nums1.length;
		int[] arr = new int[totalLength];
		int ix1 = 0, ix2 = 0;
		for (int i = 0; i < totalLength; i++) { // O(m + n) time complexity
			arr[i] = ix1 < m && ix2 < n && nums1[ix1] <= nums2[ix2] ? nums1[ix1++] : nums2[ix2++];
			System.out.println(arr[i]);
		}

		nums1 = arr;
	}

}
