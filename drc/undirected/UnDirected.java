package undirected;


import GraphType.Graph;

import java.util.ArrayList;
import java.util.List;

public class UnDirected implements Graph {

    private GraphType graphType;
    private int numOfVertices;
    private int adjacencyMatrix[][];

    public UnDirected(GraphType graphType,int numOfVertices)
    {
        this.graphType=graphType;
        this.numOfVertices=numOfVertices;
        this.adjacencyMatrix=new int[numOfVertices][numOfVertices];
    }


    @Override
    public void addEdge(int v1, int v2) {

        this.adjacencyMatrix[v1-1][v2-1]=1;

        if(graphType.equals(GraphType.UN_DIRECTED))
        {
            this.adjacencyMatrix[v2-1][v1-1]=1;
        }

    }

    @Override
    public List<Integer> getAdjacencyVertices(int v1) {

        List<Integer> list=new ArrayList<>();

           for(int i=0;i<adjacencyMatrix[0].length;i++)
           {
               if(i!=v1-1)
               {
                   if(adjacencyMatrix[v1-1][i]==1)
                   {
                       list.add(i+1);
                   }
               }
           }

           return list;

    }
}
