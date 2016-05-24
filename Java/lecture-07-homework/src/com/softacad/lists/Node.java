package com.softacad.lists;

public class Node<T> {

	public T data;
	public Node<T> next;

	public Node(T data) {
		this.setData(data);
		setNext(null);
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
