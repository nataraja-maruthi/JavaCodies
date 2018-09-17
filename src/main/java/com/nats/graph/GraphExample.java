package com.nats.graph;

import java.util.LinkedList;

public class GraphExample {
	
	static class Graph {
		int v;
		LinkedList<Integer> adjacentList [] ;
		public Graph(int v) {
			this.v = v;
			adjacentList = new LinkedList[v];
			for (int i = 0; i < v; i++) {
				adjacentList[i] = new LinkedList<>();
			}
		}
	}
	
	static void addEdge(Graph graph, int src, int dest) {
		graph.adjacentList[src].add(dest);
		graph.adjacentList[dest].addFirst(src);
	}
	
	static void printGraph(Graph graph) {
		for (int i = 0; i < graph.v; i++) {
			System.out.println("Adjancy list for verted : " +i);
			LinkedList<Integer> linkedList = graph.adjacentList[i];
			System.out.println(linkedList);
//			for(Integer data:graph.adjacentList[i]) {
//				System.out.println("->" + data);
//			}
//			System.out.println("\n");
			
		}
	}
	
	 public static void main(String args[])
	    {
	        // create the graph given in above figure
	        int V = 5;
	        Graph graph = new Graph(V);
	        addEdge(graph, 0, 1);
	        addEdge(graph, 0, 4);
	        addEdge(graph, 1, 2);
	        addEdge(graph, 1, 3);
	        addEdge(graph, 1, 4);
	        addEdge(graph, 2, 3);
	        addEdge(graph, 3, 4);
	      
	        // print the adjacency list representation of 
	        // the above graph
	        printGraph(graph);
	    }
	

}
