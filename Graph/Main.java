package Graph;

import java.util.Scanner;

//Working thread
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int edges = sc.nextInt();
        System.out.println("Enter number of edegs");
        int vertices = sc.nextInt();
        creatingGraph graph = new creatingGraph(vertices);
        System.out.println("Enter Edges");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source vertex");
            int source = sc.nextInt();
            System.out.println("Enter destination vertex");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
    }
}