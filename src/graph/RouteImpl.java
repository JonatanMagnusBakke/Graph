package graph;

public class RouteImpl implements Route{
    private String airline, from, to;
    private float distance, time;

    public RouteImpl(String airline, String from, String to, float distance, float time) {
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String airline() {
        return airline;
    }

    @Override
    public String from() {
        return from;
    }

    @Override
    public String to() {
        return to;
    }

    @Override
    public float distance() {
        return distance;
    }

    @Override
    public float time() {
        return time;
    }

    @Override
    public int compareTo(Route o) {
        return 0;
    }

    @Override
    public String toString() {
        return "airline: " + airline + " from: " + from + " to: " + to;
    }
}
