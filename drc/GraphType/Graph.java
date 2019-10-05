package GraphType;

import java.util.List;

public interface Graph {

    enum GraphType
    {
        DIRECTED,
        UN_DIRECTED
    }

    void addEdge(int v1,int  v2);


    List<Integer>  getAdjacencyVertices(int v1);

}
