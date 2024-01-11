package org.example.workday;

import java.util.*;

public class ShortestPathInGraph {

    public static class Graph {
        private Map<Integer, List<Integer>> adjacencyList;

        public Graph() {
            this.adjacencyList = new HashMap<>();
        }

        public void addEdge(int source, int destination) {
            adjacencyList.computeIfAbsent(source, k -> new LinkedList<>()).add(destination);
            adjacencyList.computeIfAbsent(destination, k -> new LinkedList<>()).add(source);
        }

        public List<Integer> shortestPath(int start, int end) {
            if (!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)) {
                return Collections.emptyList();
            }

            Queue<Integer> queue = new LinkedList<>();
            Map<Integer, Integer> parentMap = new HashMap<>();
            Set<Integer> visited = new HashSet<>();

            queue.offer(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        queue.offer(neighbor);
                        visited.add(neighbor);
                        parentMap.put(neighbor, current);

                        if (neighbor == end) {
                            return reconstructPath(parentMap, start, end);
                        }
                    }
                }
            }

            return Collections.emptyList();
        }

        private List<Integer> reconstructPath(Map<Integer, Integer> parentMap, int start, int end) {
            List<Integer> path = new ArrayList<>();
            int current = end;

            while (current != start) {
                path.add(current);
                current = parentMap.get(current);
            }

            path.add(start);
            Collections.reverse(path);
            return path;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        List<Integer> shortestPath = graph.shortestPath(0, 5);

        if (!shortestPath.isEmpty()) {
            System.out.println("Shortest Path: " + shortestPath);
        } else {
            System.out.println("No path found between the nodes.");
        }
    }
}
