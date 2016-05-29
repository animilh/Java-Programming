package com.softacad.homework;

public class DijkstraDemo {

	public static void main(String[] args) {
		Graph G = new Graph(8);
		Node sofia = new Node("Sofia");
		Node vraca = new Node("Vraca");
		Node plovdiv = new Node("Plovdiv");
		Node karlovo = new Node("Karlovo");
		Node varna = new Node("Varna");
		Node veliko = new Node("Veliko Tyrnovo");
		Node montana = new Node("Montana");
		Node varvara = new Node("Varvara");
		Node burgas = new Node("Burgas");
		
		
		G.addEdge(sofia, vraca, 3);
		G.addEdge(sofia,plovdiv , 4);
		G.addEdge(sofia,karlovo , 4);
		G.addEdge(plovdiv,varna , 5);
		G.addEdge(plovdiv,veliko , 4);
		G.addEdge(veliko, karlovo, 3);
		G.addEdge(veliko, vraca, 4);
		G.addEdge(varna, montana , 10);
		G.addEdge(vraca, montana, 5);
		G.addEdge(plovdiv, karlovo, 1);
		G.addEdge(burgas, varvara, 3);
		

		Dijkstra dijkstra = new Dijkstra(G);
		System.out.println("The shortest path from " + varna + " to " + veliko + " is " +dijkstra.findShortest(varna, veliko));

/*		Iterator<Node> it = path.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getValue() + " value : " + it.next().getDistance());
		}
		*/

	}

}
