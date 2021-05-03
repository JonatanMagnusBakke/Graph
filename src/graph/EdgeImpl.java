package graph;

public class EdgeImpl implements Edge{
    private int a, b;
    private float w;

    public EdgeImpl(int a, int b, float w) {
        this.a = a;
        this.b = b;
        this.w = w;
    }

    @Override
    public int from() {
        return a;
    }

    @Override
    public int to() {
        return b;
    }

    @Override
    public float weight() {
        return w;
    }

    @Override
    public int compareTo(Edge o) {
        float f = this.w - o.weight();
        if(f > 0) return 1;
        if( f < 0) return -1;
        return 0;
    }
}
