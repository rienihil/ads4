import java.util.*;

public class Search<V> {
    protected Set<Vertex<V>> visited;
    protected Map<Vertex<V>, Vertex<V>> edgeTo;
    protected Vertex<V> start;

    public Search(Vertex<V> start){
        this.visited = new HashSet<>();
        this.edgeTo = new HashMap<>();
        this.start=start;
    }

    public boolean hasPathTo(Vertex<V> vertex){
        return visited.contains(vertex);
    }

    public Iterable<V> pathTo(Vertex<V> vertex){
        if (!hasPathTo(vertex)){
            return null;
        }
        LinkedList<V> path = new LinkedList<>();
        for (Vertex<V> v = vertex; v != start; v=edgeTo.get(v)){
            path.push(v.getData());
        }
        path.push(start.getData());
        return path;
    }
}
