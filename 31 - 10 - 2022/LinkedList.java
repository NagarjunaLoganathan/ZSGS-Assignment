package test;

public class LinkedList<T> {

	private Node front;
	private Node rear;
	private int size;
	private Object[] arr = new Object[10];

	private class Node {
		@SuppressWarnings("unused")
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
			arr[size] = front;
		} else {
			rear.next = new Node(item);
			rear = rear.next;
			arr[size] = rear;
		}
		size++;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (arr.length != 0) {
			for (int i = 0; i < arr.length; i++) {
				if (i == index) {
					return (T) arr[i];
				}
			}
		}
		return null;

	}

//	public T get() {
//		if (front != null) {
//			T result = front.data;
//			front = front.next;
//			size--;
//			return result;
//		}
//		return null;
//	}
//
//	public int size() {
//		return size;
//	}
}