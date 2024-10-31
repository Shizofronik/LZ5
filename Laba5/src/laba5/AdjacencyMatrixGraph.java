package laba5;

public class AdjacencyMatrixGraph {
    private int[][] adjacencyMatrix;
    private int numberOfVertices;

    // Конструктор для создания графа с заданным числом вершин
    public AdjacencyMatrixGraph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyMatrix = new int[numberOfVertices][numberOfVertices];
    }

    // Метод для добавления ребра в граф
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1; // Для направленного графа
        // Если граф ненаправленный, нужно добавить и обратное ребро:
        // adjacencyMatrix[destination][source] = 1;
    }

    // Метод для отображения графа
    public void displayGraph() {
        for (int i = 0; i < numberOfVertices; i++) {
            for (int j = 0; j < numberOfVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(7); // Создаем граф с 4 вершинами
        
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(0, 3); 
        graph.addEdge(0, 4); 
        graph.addEdge(0, 5); 
        graph.addEdge(0, 6);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);       
        graph.addEdge(1, 6);    
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);       
        graph.addEdge(2, 6);
        graph.addEdge(3, 0);
        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);       
        graph.addEdge(3, 5);
        graph.addEdge(4, 0);
        graph.addEdge(4, 3);
        graph.addEdge(4, 2);
        graph.addEdge(4, 6);       
        graph.addEdge(4, 5);
        graph.addEdge(5, 0);
        graph.addEdge(5, 1);
        graph.addEdge(5, 3);
        graph.addEdge(5, 6);       
        graph.addEdge(5, 4);
        graph.addEdge(6, 0);
        graph.addEdge(6, 1);
        graph.addEdge(6, 2);
        graph.addEdge(6, 5);       
        graph.addEdge(6, 4);
        
        
        // Отображаем граф
        System.out.println("Матрица смежности графа:");
        graph.displayGraph();
    }
}
