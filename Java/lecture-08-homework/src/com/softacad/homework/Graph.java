package com.softacad.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private final Map<Node, ArrayList<Edge>> map;
    private final int numberOfCities; 

    Graph(int numberOfCities) {
        if (numberOfCities < 0) {
            throw new IllegalArgumentException("The map should contain at least 1 city!");
        }
        this.numberOfCities = numberOfCities;
        this.map = new HashMap<Node, ArrayList<Edge>>();
    }

    public void addEdge (Node node1, Node node2, int distance) {
        if (node1 == null || node2 == null) {
            throw new NullPointerException("Null value of city!");
        }
        if (distance < 0) {
            throw new IllegalArgumentException(" The distance cannot be negative.");
        }

        Edge edge = new Edge(node1, node2, distance);

        addToMap(node1, edge);
        addToMap(node2, edge);
    }

    private void addToMap (Node node, Edge edge) {
        if (map.containsKey(node)) {
            List<Edge> l = map.get(node);
            l.add(edge);
            return;
        }
        List<Edge> l = new ArrayList<Edge>();
        l.add(edge);
        map.put(node,(ArrayList<Edge>) l);          
    }

    public List<Edge> getAdjacencies(Node node) {
        return map.get(node);
    }

    public Map<Node, ArrayList<Edge>> getGraph() {
        return map;
    }


    public int getNumVertices() {
        return numberOfCities;
    }
}
