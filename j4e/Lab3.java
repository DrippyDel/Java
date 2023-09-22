import java.util.*;
import java.io.*;

// Implement Disjoint Set class

class DS
{
  int [] parent;
  int [] position;
  int numTrees;

  public DS(int n)
  {
    parent = new int[n];
    position = new int[n];
    numTrees = n;

    for (int i = 0; i < n; i++)
    {
      parent[i] = i;
      position[i] = 0;
    }
  }

  public int find(int n)
  {
    if (parent[n] != n)
    {
      parent[n] = find(parent[n]);
    }
    return parent[n];
  }

  public void union(int y, int x)
  {
    int rootY = find(y);
    int rootX = find(x);

    if (rootX != rootY)
    {
      if (position[rootX] < position[rootY])
      {
        parent[rootX] = rootY;
      }
      else if (position[rootX] > position[rootY])
      {
        parent[rootY] = rootX;
      }
      else
      {
        parent[rootY] = rootX;
        position[rootX]++;
      }
      numTrees--;
    }
  }
}

public class Lab3
{
  // Class members
  public static int n;
  public static int e;

  // Adj list to represent graph
  public static ArrayList<Integer>[] graph;

  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);

    // Nodes
    n = in.nextInt();

    // Edges
    e = in.nextInt();

    graph = new ArrayList[n];
    //public static ArrayList<ArrayList<Integer>> graph;
    for (int i = 0; i < n; i++)
    {
       graph[i] = new ArrayList<Integer>();
    //  graph.add(new ArrayList<Integer>())
    }

    // Read in our Edges
    for (int i = 0; i < e; i++)
    {
      int node1 = in.nextInt() - 1;
      int node2 = in.nextInt() - 1;

      graph[node1].add(node2);
      graph[node2].add(node1);
    }

    // Next N lines: order the barns are closed
    int [] remList = new int[n];
    for (int i = 0; i < n; i++)
    {
      remList[i] = in.nextInt() - 1;
    }

    // Assume: all the nodes are closed
    DS ds = new DS(n);

    // Track of open/closed barns
    boolean[]possible = new boolean[n];
    boolean[]result = new boolean[n];

    possible[remList[n-1]] = true;
    result[n-1] = true;

    // Core soln:
    // Iterate in reverse order of the remList
    for (int i = n - 2; i >= 0 ; i--)
    {
      int currNode = remList[i];

      // Go through the neighbors
      for (int j = 0; j < graph[currNode].size(); j++)
      {
        int neighborNode = graph[currNode].get(j);
        if (possible[neighborNode])
        {
          ds.union(currNode, neighborNode);
        }
      }
      possible[currNode] = true;
      result[i] = (ds.numTrees == i + 1);
    }

    // Iterate through the result
    for (int i = 0; i < n; i++)
    {
      if (result[i])
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }

}
