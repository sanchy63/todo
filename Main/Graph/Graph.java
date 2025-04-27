package Main.Graph;
import java.util.*;

public class Graph {
    private List<Integer>[] list;
    private int vertices;
    public Graph(int vertices){
        list=new ArrayList[vertices];
        this.vertices=vertices;
        for(int i=0;i<vertices;i++){
            list[i]=new ArrayList<>();
        }
    }
    public void addedge(int source,int destination){
        list[source].add(destination);
        list[destination].add(source); //for undirected graph
    }
    public void print(){
        for(int i=0;i<vertices;i++){
            System.out.println("vertex" + i +":");
            for(int edge:list[i]){
                System.out.println("->" + edge);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.addedge(0, 1);
        graph.addedge(0, 2);
        graph.addedge(1, 2);
        graph.addedge(1, 4);
        graph.addedge(0, 4);
        graph.addedge(2, 0);
        graph.addedge(2, 4);
        graph.addedge(3, 4);
        graph.addedge(1, 0);
        graph.addedge(4, 3);
        graph.print();
    }
}
