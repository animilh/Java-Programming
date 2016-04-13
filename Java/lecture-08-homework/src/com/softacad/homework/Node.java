package com.softacad.homework;

class Node {
    private final String cityName;
    private int distance = Integer.MAX_VALUE;

    public Node (String cityName) {
        this.cityName = cityName;
    }

    public String getValue() {
        return cityName;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        Node node = (Node) o;
        return node.getValue() == cityName;
    }

    @Override
    public int hashCode() {
        return (int) cityName.hashCode();
    }
    
    public static void main(String[] args) {
		Node n1 = new Node("Ani");
		Node n2 = new Node("Ivo");
		System.out.println("n1 equals to n2 : " +n1.equals(n2));
		System.out.println("Hashcode of n1 " + n1.hashCode());
		System.out.println("Hashcode of n2 " + n2.hashCode());
		System.out.println("n1 distance "+ n1.getDistance());
		System.out.println("n2 distance "+ n2.getDistance());
		
		
	}
}
