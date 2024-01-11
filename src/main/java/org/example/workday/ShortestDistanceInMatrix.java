package org.example.workday;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 1, 1, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1}
        };

        int sourceX = 0;
        int sourceY = 0;
        int destX = 4;
        int destY = 4;

        int shortestDistance = findShortestDistance(matrix, sourceX, sourceY, destX, destY);

        System.out.println("Shortest distance: " + shortestDistance);
    }

    public static int findShortestDistance(int[][] matrix, int sourceX, int sourceY, int destX, int destY) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int[] dx = {-1, 1, 0, 0};  // Directions: up, down, left, right
        int[] dy = {0, 0, -1, 1};

        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(sourceX, sourceY, 0));
        visited[sourceX][sourceY] = true;

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

            if (current.x == destX && current.y == destY) {
                return current.distance; // Destination reached
            }

            // Explore neighboring cells
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (isValid(newX, newY, rows, cols) && matrix[newX][newY] == 1 && !visited[newX][newY]) {
                    queue.offer(new Cell(newX, newY, current.distance + 1));
                    visited[newX][newY] = true;
                }
            }
        }

        return -1; // Destination not reachable
    }

    private static boolean isValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    static class Cell {
        int x;
        int y;
        int distance;

        Cell(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
