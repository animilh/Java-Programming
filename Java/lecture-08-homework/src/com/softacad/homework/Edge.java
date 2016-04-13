package com.softacad.homework;

public class Edge {	
    public Node start;
    public Node end;
    public int distance;
    
    public Edge(Node node1, Node node2, int distance){
    	this.start = node1;
    	this.end = node2;
    	this.distance = distance;
    }
    
    public int getDistance(){
    	return this.distance;
    }
    
    public Node getAdjacentNode(Node n){
    	return n.getValue() == start.getValue() ? end : start;
    }
    
}