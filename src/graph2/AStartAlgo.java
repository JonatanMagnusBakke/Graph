package graph2;

import graph.Graph;

import java.util.ArrayList;

public class AStartAlgo {
    private Graph graph;
    private int startNode;
    private int targetNode;
    private Heuristic heuristic;

    public AStartAlgo(AStarProblem problem) {
        this.graph = problem.getGraph();
        this.startNode = problem.getStartNode();
        this.targetNode = problem.getTargetNode();
        this.heuristic = problem.getHeuristic();
    }

    public ArrayList<Integer> solve()
    {
        int currentNode = startNode;
        //Save some kind of list.....
        ArrayList<Integer> path = new ArrayList<>();
        while (currentNode != targetNode)
        {
            currentNode = createHList(currentNode);
            path.add(currentNode);
            System.out.println(currentNode);
        }
        return path;
    }

    private int createHList(int currentNode)
    {
        var adj = graph.adj(currentNode);
        ArrayList<Pair> hList = new ArrayList<Pair>();
        for (var ad: adj)
        {
            float f = heuristic.h(ad.to(), targetNode);
            float g = heuristic.h(ad.to(), startNode);
            float h = g + f;
            hList.add(new Pair(ad.to(), h));
        }

        Pair shortest = hList.get(0);
        for (int i = 1; i < hList.size(); i++) {
            if(hList.get(i).floatv < shortest.floatv)
            {
                shortest = hList.get(i);
            }
        }
        return shortest.integer;
    }
}
