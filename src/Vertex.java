import java.util.Map;

public class Vertex<V>{
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data){
        this.data=data;
    }

    public void addAdjacentVertices(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }
}
