package com.softacad.homework;

import com.softacad.homework.Node;

public class ListExample {

	public static void main(String[] args) {

		DoubleLinkedList<String> list = new DoubleLinkedList<>();

		System.out.println("--Inserting--");

		list.insertAt(0, new Node<String>("Lili"));
		list.insertAt(1, new Node<String>("Ivan"));
		list.insertAt(2, new Node<String>("Dragan"));
		list.insertAt(3, new Node<String>("Evgenii"));
		list.insertAt(4, new Node<String>("Petyr"));
		list.insertAt(5, new Node<String>("Todor"));

		System.out.println(list);

		System.out.println("--Insert after--" + list.getNode(1));
		Node<String> newNode = new Node<String>("Georgi");
		Node<String> node = list.getNode(1);
		list.insertAfter(node, newNode);
		System.out.println(list);

		System.out.println("--Delete after--" + list.getNode(0));
		Node<String> node1 = list.getNode(0);
		list.deleteAfter(node1);
		System.out.println(list);

		System.out.println("--Set element--");
		list.insertAt(0, new Node<String>("Mitko"));
		try {
			list.insertAt(10, new Node<String>("Dimityr"));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index 10");
		}
		System.out.println(list);
		System.out.println("--Get--");
		System.out.println("0-" + list.getNode(0));
		System.out.println("1-" + list.getNode(1));

		System.out.println("--Delete element--" + list.getNode(4));
		list.deleteAt(4);
		System.out.println(list);

	}
}
