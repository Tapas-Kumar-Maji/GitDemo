package LeetCode_Array101_Card_Tutorial;

class Node {
	public int val;
	public Node prev;
	public Node next;
	public Node child;
}

public class FlattenMultilevelLL {
	public Node flatten(Node head) {

		Node curr = head;
		while (curr != null) {
			Node temp = curr;

			if (curr.child != null) {
				Node originalcurrNext = curr.next;
				curr.next = curr.child;
				curr.child.prev = curr;
				curr.child = null;
				while (curr.next != null) {
					curr = curr.next;
				}
				curr.next = originalcurrNext;
				if (originalcurrNext != null) {
					originalcurrNext.prev = curr;
				}
				curr = temp;
			}
			curr = curr.next;
		}

		return head;
	}
}
