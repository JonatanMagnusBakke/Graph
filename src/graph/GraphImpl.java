package graph;

import java.io.*;
import java.util.ArrayList;

public class GraphImpl implements Graph{

    ArrayList<Edge>[] graph;
    ArrayList<Edge> edges;
    int count;

    public GraphImpl(int size) {
        count = 0;
        graph = new ArrayList[size];
        edges = new ArrayList<>();
    }

    public GraphImpl(String fileName) throws IOException {
        InputStream in = new FileInputStream(fileName);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(in))){
            String line = br.readLine();
            int v = Integer.parseInt(line);
            graph = new ArrayList[v];
            count = 0;
            edges = new ArrayList<>();
            line = br.readLine();
            int e = Integer.parseInt(line);
            for(int i = 0 ; i < e; i++)
            {
                line = br.readLine();
                String[] vs = line.split(" ");
                int v1 = Integer.parseInt(vs[0]);
                int v2 = Integer.parseInt(vs[1]);
                int w = Integer.parseInt(vs[2]);
                addEdge(v1, v2, w);
            }

        }
    }

    @Override
    public int V() {
        return graph.length;
    }

    @Override
    public int E() {
        return count;
    }

    @Override
    public void addEdge(int v, int i, float w) {
        Edge e = new EdgeImpl(v, i, w);
        edges.add(e);
        addEdgeTOList(v, e);
        //addEdgeTOList(i, e);
        count++;
    }

    private void addEdgeTOList(int v, Edge e) {
        if(graph[v] == null)
        {
            graph[v] = new ArrayList<>(graph.length + 1);

        }
        graph[v].add(e);
    }

    @Override
    public Iterable<Edge> adj(int v) {
        return graph[v];
    }

    @Override
    public Iterable<Edge> edges() {
        return edges;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(V());
        res.append('\n');
        res.append(E());
        res.append('\n');
        for(Edge e : edges())
        {
            res.append(e.from());
            res.append(' ');
            res.append(e.to());
            res.append(' ');
            res.append(e.weight());
            res.append('\n');
        }
        return res.toString();
    }
}
