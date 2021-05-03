package graph2;

import graph.Graph;

public interface AStarProblem
{
    Graph getGraph();
    int getStartNode();
    int getTargetNode();
    Heuristic getHeuristic();
}