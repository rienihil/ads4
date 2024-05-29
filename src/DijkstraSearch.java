public class DijkstraSearch<V> extends Search<V>{
    public DijkstraSearch(WeightedGraph<V> graph, V data){
        super(graph.getVertex(data));
        dijkstra(graph, start);
    }

    private void dijkstra(WeightedGraph<V> graph, Vertex<V> start){

    }
}
