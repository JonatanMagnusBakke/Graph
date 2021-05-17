package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AirportGraphImpl implements AirportGraph{

    Map<String, ArrayList<Route>> graph;
    int count;


    public AirportGraphImpl(String airports, String routes) throws IOException {
        graph = new HashMap<>();
        initializeAirports(airports);
        addEdges(routes);
    }

    private void initializeAirports(String airports) throws IOException {
        InputStream in = new FileInputStream(airports);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                var splitLine = line.split(";");
                graph.put(splitLine[0], new ArrayList<>());
            }
        }
    }

    private void addEdges(String routes) throws IOException {
        InputStream in = new FileInputStream(routes);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            while ((line = br.readLine())  != null) {
                var splitLine = line.split(";");
                var airline = splitLine[0];
                var source = splitLine[1];
                var dest = splitLine[2];
                var distance = Float.parseFloat(splitLine[3]);
                var time = Float.parseFloat(splitLine[4]);
                addEdge(airline, source, dest, distance, time);
            }
        }
    }

    @Override
    public int V() {
        return graph.size();
    }

    @Override
    public int E() {
        return count;
    }

    @Override
    public Iterable<Route> adj(String s1) {
        return graph.get(s1);
    }

    @Override
    public Iterable<Route> edges() {
        return null;
    }

    @Override
    public void addEdge(String airline, String source, String dest, float distance, float time) {
        var route = new RouteImpl(airline, source, dest, distance, time);

        var value = graph.get(source);
        value.add(route);
        count++;
    }


}
