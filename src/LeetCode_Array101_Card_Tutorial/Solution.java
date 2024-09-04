package LeetCode_Array101_Card_Tutorial;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
//	public ListNode removeNthFromEnd(ListNode head, int n) {		// [1,2] , n = 2
//        ListNode dummy = new ListNode(0, head);
//        ListNode left = dummy;	// [0,1,2]
//        ListNode right = head;  // [1,2]
//
//        while(n > 0) {
//            right = right.next;
//            n -= 1;
//        }
//
//        while(right != null) {
//            left = left.next;
//            right = right.next;
//        }
//
//        left.next = left.next.next;
//        return dummy.next;
//
//    }
}

//public class Solution {
//	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

/*
 * Map<ListNode, Integer> map = new HashMap<>();
 *
 * // Finding intersection node. while (headA != null || headB != null) { if
 * (headA != null) { map.put(headA, map.getOrDefault(headA, 0) + 1);
 *
 * if (map.get(headA) > 1) { return headA; } headA = headA.next; }
 *
 * if (headB != null) { map.put(headB, map.getOrDefault(headB, 0) + 1); if
 * (map.get(headB) > 1) { return headB; } headB = headB.next; } }
 *
 * return null;
 */

// Solution without using hashmap.
//		int lengthList1 = 0;
//		int lengthList2 = 0;
//		ListNode list1 = headA;
//		ListNode list2 = headB;
//
//		while (list1 != null || list2 != null) {
//			if (list1 != null) {
//				lengthList1++;
//				list1 = list1.next;
//			}
//
//			if (list2 != null) {
//				lengthList2++;
//				list2 = list2.next;
//			}
//		}
//
//		int diff = Math.abs(lengthList2 - lengthList1);
//		list1 = headA;
//		list2 = headB;
//
//		while (diff-- > 0) {
//			if (lengthList1 > lengthList2) {
//				list1 = list1.next;
//			} else {
//				list2 = list2.next;
//			}
//		}
//
//		while (list1 != null && list2 != null) {
//			if (list1 == list2) {
//				return list1;
//			} else {
//				list1 = list1.next;
//				list2 = list2.next;
//			}
//		}
//
//		return null;
//
//	}
//}

//public class Solution {
//	public ListNode detectCycle(ListNode head) {
//
//		Map<ListNode, Integer> map = new HashMap<>();
//
//		ListNode curr = head;
//		while (curr != null) {
//			if (map.putIfAbsent(curr, 1) == 1) {
//				return curr;
//			}
//			curr = curr.next;
//		}
//
//		return null;
//	}
//}

//class Solution1 {
//	public ListNode detectCycle(ListNode head) {
//		if (head == null) {
//			return null;
//		}
//
//		ListNode slow = head;
//		ListNode fast = head;
//
//		do {
//			slow = slow.next;
//
//			fast = fast.next;
//			if (fast == null || fast.next == null) {
//				return null;
//			}
//			fast = fast.next;
//		} while (slow != fast);
//
//		slow = head;
//		while (slow != fast) {
//			slow = slow.next;
//			fast = fast.next;
//		}
//
//		return slow;
//	}
//}
