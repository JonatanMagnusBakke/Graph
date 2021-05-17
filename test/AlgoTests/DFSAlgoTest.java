package AlgoTests;

import AirlineAlgorithms.BFSAlgo;
import AirlineAlgorithms.DFSAlgo;
import graph.AirportGraph;
import graph.AirportGraphImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DFSAlgoTest {

    private AirportGraph graph;
    private String airports = "airportTest.txt";
    private String routes = "test.txt";
    private DFSAlgo dfs;
    private BFSAlgo bfs;

    private String start;
    private String end;
    private String airline;

    @BeforeEach
    void algoSetup() {
        dfs = new DFSAlgo();
        bfs = new BFSAlgo();
    }

    @BeforeAll
    void setup() throws IOException {
        graph = new AirportGraphImpl(airports, routes);
    }

    @Test
    void DFSAlgoTestDirectConnection() {
        System.out.println("AAA -> BBB");
        start = "AAA";
        end = "BBB";
        airline = "2B";
        System.out.println(bfs.BFS(graph, start, end, airline));
        System.out.println(dfs.DFS(graph, start, end, airline));
    }

    @Test
    void DFSAlgoTestInterConnecting() {
        System.out.println("AAA -> CCC");
        start = "AAA";
        end = "CCC";
        airline = "2B";
        System.out.println(bfs.BFS(graph, start, end, airline));
        System.out.println(dfs.DFS(graph, start, end, airline));
    }

    @Test
    void DFSAlgoTest() {
        System.out.println("AAA -> DDD");
        start = "AAA";
        end = "DDD";
        airline = "2B";
        System.out.println(bfs.BFS(graph, start, end, airline));
        System.out.println(dfs.DFS(graph, start, end, airline));
    }

    @Test
    void UnconnectedShouldReturnFalse() {
        System.out.println("BBB -> ZZZ");
        start = "BBB";
        end = "ZZZ";
        airline = "2B";
        System.out.println(bfs.BFS(graph, start, end, airline));
        System.out.println(dfs.DFS(graph, start, end, airline));
    }
}