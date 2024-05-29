import java.util.HashMap;
import java.util.Map;

public class WeightedGraph<V>{
    private boolean undirected;
    private Map<V, Vertex<V>> map;

    public WeightedGraph(boolean undirected){
        this.undirected=undirected;
        this.map = new HashMap<>();
    }

    public void addVertex(V data){
        map.put(data, new Vertex<>(data));
    }

    public void addVertex(V data, Vertex<V> vertex){
        map.put(data, vertex);
    }

    public void addEdge(V source, V dest, double weight){
        Vertex<V> sourceV = map.get(source);
        Vertex<V> destV = map.get(dest);
        if (sourceV == null) {
            sourceV = new Vertex<>(source);
            addVertex(source, sourceV);
        }
        if (destV == null) {
            destV = new Vertex<>(dest);
            addVertex(dest, destV);
        }
        sourceV.addAdjacentVertices(destV, weight);
        if (undirected){
            destV.addAdjacentVertices(sourceV, weight);
        }
    }
    public Vertex<V> getVertex(V data){
        return map.get(data);
    }
}

