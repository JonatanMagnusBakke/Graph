package graph;

public interface Graph {
    int getV();
    int getE();
    void connect(int v, int i, int w);
    Iterable<Edge> getVerticesConnectedTo(int v);
    Iterable<Edge> edges();
}
