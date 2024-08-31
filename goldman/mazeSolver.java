package goldman;

import java.util.LinkedList;
import java.util.Queue;

public class mazeSolver {
    public static int getMinimumMoves(int[][] maze, int k) {
        int n = maze.length;
        int m = maze[0].length;

        // 四个方向：右、下、左、上
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // BFS队列，元素是 (当前行, 当前列, 当前步数)
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0});

        // 访问标记数组
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int moves = current[2];

            // 如果到达目的地，返回步数
            if (x == n - 1 && y == m - 1) {
                return moves;
            }

            // 尝试四个方向的跳跃
            for (int dir = 0; dir < 4; dir++) {
                for (int jump = 1; jump <= k; jump++) {
                    int nx = x + dx[dir] * jump;
                    int ny = y + dy[dir] * jump;

                    // 判断边界和障碍物
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && maze[nx][ny] == 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, moves + 1});
                    }

                    // 如果遇到边界或者障碍物，停止继续在这个方向跳跃
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m || maze[nx][ny] == 1) {
                        break;
                    }
                }
            }
        }

        // 如果无法到达目的地，返回 -1
        return -1;
    }
}
