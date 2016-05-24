package com.softacad.homework;

public class Node<T> {
	private T data;
	private Node<T> next;
	private Node<T> prev;

	public T getData() {
		return data;
	}

	protected void setData(T data) {
		this.data = data;
	}

	protected void setNext(Node<T> next) {
		this.next = next;
	}

	protected void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node(T data) {
		this.data = data;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getData().toString();
	}

	public Node<T> getNext() {
		return next;
	}

	public Node<T> getPrev() {
		return prev;
	}
}
