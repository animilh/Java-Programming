package com.softacad.homework;

import java.util.Iterator;
import java.util.Set;

public class DijkstraDemo{

	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(new Node("�����"), new Node("�����"), 3);
		G.addEdge(new Node("�����"), new Node("�������"), 4);
		G.addEdge(new Node("�����"), new Node("�������"), 4);
		G.addEdge(new Node("�������"), new Node("�����"), 5);
		G.addEdge(new Node("�������"), new Node("������ �������"), 5);
		G.addEdge(new Node("������ �������"), new Node("�������"), 3);
		G.addEdge(new Node("������ �������"), new Node("�����"), 4);
		G.addEdge(new Node("�����"), new Node("�������"), 10);
		G.addEdge(new Node("�����"), new Node("�������"), 5);
		G.addEdge(new Node("�������"), new Node("�������"), 1);


		Dijkstra dijkstra = new Dijkstra(G);
		Set<Node> path = dijkstra.findShortest("�����");

		Iterator<Node> it = path.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getValue());
		}

	}

}


