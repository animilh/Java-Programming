package com.softacad.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Dijkstra {

	private final Graph graph;

	public Dijkstra(Graph graph) {
		if (graph == null) {
			throw new NullPointerException("The input graph cannot be null.");
		}
		this.graph = graph;
	}

	/**
	 * http://stackoverflow.com/questions/2266827/when-to-use-comparable-and-comparator
	 */
	public class NodeCompator implements Comparator<Node>  {
		@Override
		public int compare(Node n1, Node n2) {
			if (n1.getDistance() > n2.getDistance()) {
				return 1;
			} else {
				return -1;
			}
		}
	};

	public Set<Node> findShortest(String source) {
		final Queue<Node> queue = new PriorityQueue<Node>(10, new NodeCompator());

		for (Entry<Node, ArrayList<Edge>> entry :  graph.getGraph().entrySet()) {
			Node currNode = entry.getKey();
			if (currNode.getValue() == source) {
				currNode.setDistance(0);
				queue.add(currNode);
			} 
		}

		final Set<Node> doneSet = new HashSet<Node>();

		while (!queue.isEmpty()) {
			Node src = queue.poll();
			if (!doneSet.contains(src)){
				doneSet.add(src);

				for (Edge edge : graph.getAdjacencies(src)) {
					Node currentNode = edge.getAdjacentNode(src);

					if (!doneSet.contains(currentNode)) {
						int newDistance = src.getDistance() + edge.getDistance();
						if (newDistance < currentNode.getDistance()) {
							currentNode.setDistance(newDistance);
							queue.add(currentNode);
						} 
					}
				}
			}
		}

		return doneSet;
	}
	
}	
