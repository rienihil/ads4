public class DijkstraSearch<V> extends Search<V>{
    public DijkstraSearch(MyGraph<V> graph, V data){
        super(graph, graph.getVertex(data));
        dijkstra(graph, start);
    }

    private void dijkstra(MyGraph<V> graph, Vertex<V> start){

    }
}
