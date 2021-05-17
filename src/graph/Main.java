package graph;

import AirlineAlgorithms.BFSAlgo;
import AirlineAlgorithms.DFSAlgo;
import DataStructures.Queue;
import DataStructures.QueueImpl;
import DataStructures.Stack;
import DataStructures.StackImpl;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        var start = "AER";
        var end = "KZN";
        var airline = "SU";

//        Graph graph = new GraphImpl("file.txt");
//        System.out.println(graph.toString());

        AirportGraph airportGraph = new AirportGraphImpl("airports.txt", "routes.txt");
//        System.out.println(airportGraph.V());
//        System.out.println(airportGraph.adj("GKA"));
//        System.out.println(airportGraph.E());

//        BFSAlgo bfsAlgo = new BFSAlgo();
//        System.out.println(bfsAlgo.BFS(airportGraph, start, end, airline));
//
//        DFSAlgo dfsAlgo = new DFSAlgo();
//        System.out.println(dfsAlgo.DFS(airportGraph, start, end, airline));


        Queue<Integer> numbers = new QueueImpl<>();
        numbers.enqueue(7);
        numbers.enqueue(9);
        numbers.enqueue(13);
        System.out.println(numbers.peek());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.isEmpty());
        numbers.enqueue(5);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.dequeue());
        System.out.println(numbers.isEmpty());
    }
}
