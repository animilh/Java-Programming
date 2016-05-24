package com.softacad.lists;

public class CircularLinkedList<T> {
	Node<T> head;
	int size;

	@SuppressWarnings("hiding")
	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

		protected T getData() {
			return data;
		}

		protected Node<T> getNext() {
			return next;
		}

		protected void setNext(Node<T> next) {
			this.next = next;
		}

	}

	public CircularLinkedList() {
		head = new Node<T>();
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(T data) {
		Node<T> firstNode = new Node<>(data, null);
		if (isEmpty()) {
			head = firstNode;

			size++;
			return;
		}
		Node<T> temp = head;

		firstNode.setNext(temp);
		head = firstNode;
		firstNode.setNext(head);

	}

	public void addLast(T data) {
		if (head == null) {
			head = new Node<T>(data, null);
			size++;
			return;

		}
		Node<T> newNode = new Node<>(data, head);
		Node<T> current = head.getNext();
		while (current != head) {
			current.getNext();
		}
		current.setNext(newNode);
		size++;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		Node<T> current = head.getNext();
		while (current != head) {
			result.append(current.getData().toString()).append("\n");

			current = current.getNext();
		}

		return result.toString();
	}

}
