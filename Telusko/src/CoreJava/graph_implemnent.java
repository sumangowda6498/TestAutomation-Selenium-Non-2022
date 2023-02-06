package CoreJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph_implemnent {
    private LinkedList<Integer> adjecency[];

    public graph_implemnent(int v){
        adjecency=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjecency[i]=new LinkedList<Integer>();
        }
    }

    public void insertEdge(int s,int d){
        adjecency[s].add(d);
        adjecency[d].add(s);

        System.out.println(adjecency[s]);
        System.out.println(adjecency[d]);
    }

    public void bsf(int source){
        boolean visited_node[]=new boolean[adjecency.length];
        int parent_node[]=new int[adjecency.length];
        Queue<Integer> q=new LinkedList<>();

        q.add(source);
        visited_node[source]=true;
        parent_node[source]=-1;

        while (!q.isEmpty()){
            int p= q.poll();
            System.out.print(p);
            for (int i:adjecency[p]){
                if((visited_node[i])!=true) {
                    visited_node[i] = true;
                    q.add(i);
                    parent_node[i] = p;
                }
                }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v= sc.nextInt();
        int e= sc.nextInt();

        graph_implemnent g=new graph_implemnent(v);
        System.out.println("Enter the edge ");
        for(int i=0;i<e;i++){
            int s= sc.nextInt();
            int d=sc.nextInt();
            g.insertEdge(s,d);
        }
        System.out.println("Enter the source");
        int source= sc.nextInt();
        g.bsf(source);
    }

}
