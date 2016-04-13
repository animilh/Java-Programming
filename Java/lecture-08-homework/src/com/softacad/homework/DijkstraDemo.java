package com.softacad.homework;

import java.util.Iterator;
import java.util.Set;

public class DijkstraDemo{

	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(new Node("София"), new Node("Враца"), 3);
		G.addEdge(new Node("София"), new Node("Пловдив"), 4);
		G.addEdge(new Node("София"), new Node("Карлово"), 4);
		G.addEdge(new Node("Пловдив"), new Node("Варна"), 5);
		G.addEdge(new Node("Пловдив"), new Node("Велико Търново"), 5);
		G.addEdge(new Node("Велико Търново"), new Node("Карлово"), 3);
		G.addEdge(new Node("Велико Търново"), new Node("Враца"), 4);
		G.addEdge(new Node("Варна"), new Node("Монтана"), 10);
		G.addEdge(new Node("Враца"), new Node("Монтана"), 5);
		G.addEdge(new Node("Пловдив"), new Node("Карлово"), 1);


		Dijkstra dijkstra = new Dijkstra(G);
		Set<Node> path = dijkstra.findShortest("София");

		Iterator<Node> it = path.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getValue());
		}

	}

}


