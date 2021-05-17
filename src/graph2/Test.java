package graph2;


import graph.Graph;

public class Test
{
	public static void main(String[] args)
	{
		AStarProblem problem = new ManhattanProblem(new ExampleManhattanGraph());
		Graph g = problem.getGraph();
		//System.out.println(problem.getStartNode());
		//System.out.println(g);
		AStartAlgo alo = new AStartAlgo(problem);
		var list = alo.solve();
	}
}
