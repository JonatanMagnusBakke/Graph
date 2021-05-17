package graph;

public interface AirportGraph {
    int V();
    int E();
    Iterable<Route> adj(String s1);
    Iterable<Route> edges();
    void addEdge(String airline, String source, String dest, float distance, float time);
}
