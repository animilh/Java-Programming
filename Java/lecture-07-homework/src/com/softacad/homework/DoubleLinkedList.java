package com.softacad.homework;

import com.softacad.homework.Node;

public class DoubleLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoubleLinkedList() {
		head = new Node<>();
		tail = new Node<>();
		head.setNext(tail);
		tail.setPrev(head);
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int getSize() {
		return size;
	}

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	protected void checkIndex(int index) {
		if (index > getSize() || index < 0) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
	}

	public void insertAfter(Node<T> element, Node<T> newElement) {
		if (isEmpty()) {
			newElement.setNext(head.getNext());
			head.setNext(newElement);
			newElement.setPrev(head);
			size++;
			return;
		}
		newElement.setNext(element.getNext());
		element.setNext(newElement);
		newElement.setPrev(element);
		newElement = element.getNext().getPrev();
		size++;
	}

	public void deleteAfter(Node<T> element) {
		Node<T> tmp = element.getNext();
		element.setNext(element.getNext().getNext());
		element = tmp.getNext().getPrev();
		size--;

	}

	public Node<T> getNode(int index) {
		int i = 0;
		Node<T> currentNode = head.getNext();
		while (currentNode != tail && i != index) {
			currentNode = currentNode.getNext();
			i++;
		}
		return currentNode;
	}

	public void insertAt(int index, Node<T> newNode) {
		if (index == 0) {
			insertFirst(newNode);
			return;
		}
		checkIndex(index);
		Node<T> currentNode = getNode(index - 1);
		insertAfter(currentNode, newNode);
		size++;
	}

	private void insertFirst(Node<T> newNode) {
		// TODO Auto-generated method stub
		newNode.setNext(head.getNext());
		head.setNext(newNode);
		newNode.setPrev(head);
		size++;
	}

	public void deleteAt(int index) {
		checkIndex(index);
		Node<T> currentNode = getNode(index - 1);
		deleteAfter(currentNode);
		size--;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		Node<T> temp = head.getNext();
		while (temp != tail) {
			result.append(temp.getData().toString()).append("\n");
			temp = temp.getNext();
		}
		return result.toString();
	}
}
