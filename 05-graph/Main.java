import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        System.out.print(g);
        System.out.println("Vertices adjacent to 0: " + Arrays.toString(g.findAdjacencyVertices(0)));
    }

    public interface GraphInterface {
        public void addEdge(int v, int w);

        public void removeEdge(int v, int w);

        public int[] findAdjacencyVertices(int v);

        public String toString();
    }
    public static class Graph implements GraphInterface {
        private int verticesNumber;
        private int[][] matrix;

        public Graph() {
            verticesNumber = 5;
            matrix = new int[verticesNumber][verticesNumber];
        }

        public Graph(int v) {
            verticesNumber = v;
            matrix = new int[verticesNumber][verticesNumber];
        }

        public void addEdge(int v, int w) {
            matrix[v][w] = 1;
            matrix[w][v] = 1;
        }

        public void removeEdge(int v, int w) {
            matrix[v][w] = 0;
            matrix[w][v] = 0;
        }

        public int[] findAdjacencyVertices(int v) {
            int[] vert = new int[verticesNumber];
            int total = 0;

            for (int i = 0; i < verticesNumber; i++) {
                if (matrix[v][i] == 1) {
                    vert[total] = i;
                    total++;
                }
            }
            return Arrays.copyOf(vert, total);
        }

        public String toString()
        {
            String s = " ";
            for (int i = 0; i < verticesNumber; i++)
            {
                for (int j = 0; j < verticesNumber; j++)
                {
                    s += matrix[i][j] + " ";
                }
                s += "\n";
            }
            return s;
        }
    }
}
