package AirlineAlgorithms;

import DataStructures.Queue;
import DataStructures.QueueImpl;
import DataStructures.Stack;
import DataStructures.StackImpl;
import graph.AirportGraph;
import graph.Route;

import java.util.HashMap;
import java.util.Map;

//        procedure DFS(G, v) is
//        label v as discovered
//        for all directed edges from v to w that are in G.adjacentEdges(v) do
//        if vertex w is not labeled as discovered then
//        recursively call DFS(G, w)

public class DFSAlgo {
    Map<String, Boolean> visitedAirports;

    public DFSAlgo() {
        this.visitedAirports = new HashMap<>();
    }


    public boolean DFS(AirportGraph graph, String start, String end, String airline) {

        if(start.equals(end)) {
            return true;
        }

        visitedAirports.put(start, true);

        for (Route route: graph.adj(start)) {
            if (!visitedAirports.containsKey(route.to())) {
                if (route.airline().equals(airline)) {
                    return DFS(graph, route.to(), end, airline);
                }
            }
        }
        
        return false;
    }

}
