import GraphType.Graph;
import undirected.UnDirected;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        UnDirected unDirected=new UnDirected(Graph.GraphType.DIRECTED,8);
        unDirected.addEdge(1,2);
        unDirected.addEdge(1,4);
        unDirected.addEdge(1,3);
        unDirected.addEdge(2,6);
        unDirected.addEdge(3,4);
        unDirected.addEdge(3,5);
        unDirected.addEdge(5,7);
        unDirected.addEdge(6,7);
        unDirected.addEdge(6,8);


        List<Integer> integers=unDirected.getAdjacencyVertices(8);

        System.out.println(integers.toString());
    }
}
