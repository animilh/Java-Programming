package com.softacad.homework;

public class Queue<T> implements ISequence<T> {

	@SuppressWarnings("hiding")
	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}
	}

	public static class QueueEmptyException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public QueueEmptyException() {
		}

		public QueueEmptyException(final String message) {
			super(message);
		}
	}

	Node<T> head;
	Node<T> tail;
	int size;

	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(T data) {
		Node<T> element = new Node<>(data, null);
		if (isEmpty()) {
			head = element;
			tail = element;
			size++;
			return;
		}
		tail.next = element;
		tail = tail.getNext();
		size++;
	}

	public T pop() {
		assertNoEmpty();
		Node<T> tmp = head;
		head = tmp.getNext();

		if (head == null) {
			tail = null;
		}
		size--;

		return (T) tmp.getData();
	}

	public T get(int index) {
		int i = 0;
		Node<T> current = head;
		while (current != tail && i != index) {
			current = current.getNext();
			i++;
		}
		return current.getData();
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		Node<T> current = head;
		while (current != null) {
			result.append(current.getData().toString()).append("\n");

			current = current.getNext();
		}

		return result.toString();
	}

	public void assertNoEmpty() {
		if (isEmpty()) {
			throw new QueueEmptyException("Empty Queue!");
		}
	}

}
