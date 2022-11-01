package test;

public class LinkedList<T> {

	private Node front;
	private Node rear;
	private int size;

	private class Node {
		private T data;
		private Node next;

		public Node(T item) {
			super();
			this.data = item;
			this.next = null;
		}

	}

	public void add(T item) {
		if (front == null) {
			rear = new Node(item);
			front = rear;
		} else {
			rear.next = new Node(item);
			rear = rear.next;
		}
		size++;
	}

	public T get(int index) {
		int i = 0;
		Node current = front;
		while (current != null) {
			if (index == i) {
				return ((T) current.data);
			}
			current = current.next;
			i++;
		}
		return null;
	}

	public int size() {
		return size;
	}
}