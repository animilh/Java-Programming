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

	public int findShortest(Node start, Node end) {		
		if (start == null || end == null) {
			throw new IllegalArgumentException("Enter valid city names !");
		}
		
		if (!graph.hasNode(start) || !graph.hasNode(end)) {
			throw new IllegalArgumentException(start + " or " + end + " points are not in the map");
		}
		
		Queue<Node> queue = new PriorityQueue<Node>(graph.getNumVertices(), new NodeCompator());
		
		for (Entry<Node, ArrayList<Edge>> entry :  graph.getGraph().entrySet()) {
			Node currNode = entry.getKey();
			if (currNode.equals(start)) {
				currNode.setDistance(0);
				queue.add(currNode);
			} 
		}
		// set of settled nodes
		Set<Node> doneSet = new HashSet<Node>();

		while (!queue.isEmpty()) {
			Node src = queue.poll();
			
			if(src.equals(end)) {
				return src.getDistance();
			}
			
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

		throw new RuntimeException(end + " node is unreachable");
	}
	
}	