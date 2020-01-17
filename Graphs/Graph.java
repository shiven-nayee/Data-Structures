import java.util.Vector;

public class Graph <T>{
  private Vector vertices;

  private class Edges {
    private Vector Edges;
    public Edges() { Edges = new Vector(100); };
  }
  
  public Graph() {
    vertices = new Vector(100);
  }

  public void addVertice(Object obj) {
    vertices.add(obj);
  }

  public void addEdge(Vector vertice) {
    vertice.add(Edges());
  }
}