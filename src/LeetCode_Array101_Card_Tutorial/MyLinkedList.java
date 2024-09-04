package LeetCode_Array101_Card_Tutorial;

class MyListNode {
	int val;
	MyListNode next;

	MyListNode(int val) {
		this.val = val;
	}
}

class MyLinkedList {

	MyListNode head = null;

	public MyLinkedList() {

	}

	public int get(int index) { // 0 based index
		MyListNode curr = this.head;
		try {
			for (int i = 0; i < index; i++) {
				curr = curr.next;
			}
		} catch (NullPointerException e) {
			return -1;
		}

		if (curr == null) {
			return -1;
		}
		return curr.val;
	}

	public void addAtHead(int val) {
		MyListNode list = new MyListNode(val);
		list.next = this.head;
		this.head = list;
	}

	public void addAtTail(int val) {
		MyListNode node = new MyListNode(val);
		MyListNode curr = this.head;
		if (this.head == null) {
			head = node;
			return;
		}
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}

	public void addAtIndex(int index, int val) {
		MyListNode prev = this.head;
		for (int i = 0; i < index - 1 && prev != null && prev.next != null; i++) {
			prev = prev.next;
		}

		MyListNode nodeToAdd = new MyListNode(val);
		if (index == 0) {
			addAtHead(val);
			return;
		}
		if (prev == null || prev.next == null) {
			this.addAtTail(val);
			return;
		}
		nodeToAdd.next = prev.next;
		prev.next = nodeToAdd;
	}

	public void deleteAtIndex(int index) {
		MyListNode curr = new MyListNode(0);
		curr.next = head;
		MyListNode dummy = curr;

		for (int i = 0; i < index && curr != null; i++) {
			curr = curr.next;
		}

		if (curr != null && curr.next != null) {
			curr.next = curr.next.next;
		}

		this.head = dummy.next;
	}

	public static void main(String[] args) {
		MyLinkedList obj = new MyLinkedList();
		obj.addAtIndex(1, 0);
		int param_0 = obj.get(0);
		System.out.println("index_1 :" + obj.get(1));

//		obj.addAtHead(4);
//		obj.addAtTail(3);
//		obj.deleteAtIndex(0);

		while (obj.head != null) { // printing the values in the ll.
			System.out.println(obj.head.val);
			obj.head = obj.head.next;
		}

		System.out.println("param_0 : " + param_0);
	}
}
