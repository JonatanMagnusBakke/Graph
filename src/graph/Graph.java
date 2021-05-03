package graph;


public interface Graph {
    /*
    int getV();
    int getE();
    void connect(int v, int i, int w);
    Iterable<Edge> getVerticesConnectedTo(int v);
    Iterable<Edge> edges();


     */
    int V();
    int E();
    Iterable<graph.Edge> adj(int v);
    Iterable<Edge> edges();
    void addEdge(int v1, int v2, float w);
}
