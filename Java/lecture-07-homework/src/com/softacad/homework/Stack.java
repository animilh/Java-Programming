package com.softacad.homework;

public class Stack<T> implements ISequence<T> {

	private Node<T> top;
	private int size;

	@SuppressWarnings("hiding")
	private class Node<T> {
		private T data;
		private Node<T> prev;

		public Node(T data) {
			this.data = data;
			prev = null;
		}

		public Node(T data, Node<T> prev) {
			this.data = data;
			this.prev = prev;
		}

		public T getData() {
			return data;
		}

		public Node<T> getPrev() {
			return prev;
		}

		@SuppressWarnings("unused")
		protected void setPrev(Node<T> prev) {
			this.prev = prev;
		}
	}

	public static class StackEmptyException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public StackEmptyException() {
		}

		public StackEmptyException(final String message) {
			super(message);
		}
	}

	public Stack() {
		top = null;
		size = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(T data) {
		if (isEmpty()) {
			top = new Node<>(data);
			size++;
			return;
		}
		Node<T> newTop = new Node<>(data, top);
		top = newTop;
		size++;
	}

	public T pop() {
		assertNoEmpty();
		T value = top.getData();
		top = top.getPrev();
		size--;
		return value;
	}

	public T get(int index) {
		int i = 0;
		Node<T> current = top;
		while (current != null && i != index) {
			current = current.getPrev();
			i++;
		}
		if (i < index) {
			throw new IndexOutOfBoundsException();
		}
		return current.getData();
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		int i = 0;
		Node<T> current = top;
		while (current != null) {
			result.append(current.getData().toString()).append("\n");
			current = current.getPrev();
			i++;
		}
		return result.toString();
	}

	public int getSize() {
		return size;
	}

	public Node<T> getTop() {
		return top;
	}

	@Override
	public void assertNoEmpty() {
		if (isEmpty()) {
			throw new StackEmptyException("The Stack is empty!");
		}
	}
}