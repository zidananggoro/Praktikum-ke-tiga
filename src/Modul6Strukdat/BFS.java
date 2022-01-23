package Modul6Strukdat;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];

    // membuat  graph
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Tambahkan edges ke grafik
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS algorithm
    void BFSS(int s) {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(12);


        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 1);
        g.addEdge(2, 5);
        g.addEdge(5, 2);
        g.addEdge(5, 3);
        g.addEdge(5, 9);
        g.addEdge(5, 7);
        g.addEdge(4, 6);
        g.addEdge(6, 7);
        g.addEdge(7, 6);
        g.addEdge(7, 11);
        g.addEdge(11, 7);
        g.addEdge(8, 9);
        g.addEdge(8, 11);
        g.addEdge(9, 5);
        g.addEdge(9, 8);
        g.addEdge(11, 10);

        System.out.println(" First Traversal " + "(di mulai vertex 1)");

        g.BFSS(1);
    }
}
