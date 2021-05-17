package graph;

public interface Route extends Comparable<Route> {

    String airline();
    String from();
    String to();
    float distance();
    float time();
}
