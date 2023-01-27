package Graph;


public class creatingGraph {
   private java.util.LinkedList<Integer> adjacency[];
   public creatingGraph(int vertex){
    adjacency = new java.util.LinkedList[vertex];
    for(int i=0;i<vertex;i++){
        adjacency[i]=new java.util.LinkedList<Integer>();
   }
   }

   public void addEdge(int source, int destination){
      adjacency[source].add(destination);
      adjacency[destination].add(source);

      System.out.println(adjacency[source]);
      System.out.println(adjacency[destination]);
   } 
}