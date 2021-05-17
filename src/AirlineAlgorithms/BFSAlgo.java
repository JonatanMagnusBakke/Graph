package AirlineAlgorithms;

//        1  procedure BFS(G, root) is
//        2      let Q be a queue
//        3      label root as discovered
//        4      Q.enqueue(root)
//        5      while Q is not empty do
//        6          v := Q.dequeue()
//        7          if v is the goal then
//        8              return v
//        9          for all edges from v to w in G.adjacentEdges(v) do
//        10              if w is not labeled as discovered then
//        11                  label w as discovered
//        12                  Q.enqueue(w)


import DataStructures.Queue;
import DataStructures.QueueImpl;
import graph.AirportGraph;
import graph.Route;

import java.util.HashMap;
import java.util.Map;

public class BFSAlgo {
    Map<String, Boolean> visitedAirports;

    public BFSAlgo() {
        this.visitedAirports = new HashMap<>();
    }

    public boolean BFS(AirportGraph graph, String start, String end, String airline) {

        Queue<String> queue = new QueueImpl<>();
        queue.enqueue(start);

        visitedAirports.put(start, true);

        while (!queue.isEmpty()) {
            var v = queue.dequeue();
            if (v.equals(end)) {
                return true;
            }
            for (Route route: graph.adj(v)) {
                if (airline.equals(route.airline())) {
                    if (!visitedAirports.containsKey(route.to())) {
                        queue.enqueue(route.to());
                        visitedAirports.put(route.to(), true);
                    }
                }
            }

        }
        return false;
    }

}
