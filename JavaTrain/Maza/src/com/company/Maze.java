package com.company;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述: 迷宫的类型定义
 */
public class Maze implements MazeFile {
    // 迷宫所有的路径存储在二维数组当中
    protected MazeNode[][] maze;
    // 存储迷宫路径节点的队列结构，采用层层扩张的方式，寻找迷宫最优的路径信息
    private Queue<MazeNode> queue;
    // 迷宫的行数
    private int row;
    // 迷宫的列数
    private int col;
    // 记录迷宫路径节点的行走信息
    private MazeNode[] pathrecord;

    protected String MazePath;

    /**
     * 迷宫初始化
     *
     * @param row
     * @param col
     */
    public Maze(int row, int col) {
        this.row = MaxHight;
        this.col = MaxWidth;
        this.maze = new MazeNode[row][col];
        this.queue = new LinkedList<>();
        this.pathrecord = new MazeNode[row * col];
    }

    public Maze(String MazePath) {
        this.row = MaxHight;
        this.col = MaxWidth;
        this.maze = new MazeNode[row][col];
        this.queue = new LinkedList<>();
        this.pathrecord = new MazeNode[row * col];
        this.maze = LoadMapFromFile(MazePath);
        this.MazePath = new String(MazePath);
    }

    /**
     * 初始化指定位置的迷宫节点
     *
     * @param data
     * @param i
     * @param j
     */
    public void initMazeNode(int data, int i, int j) {
        this.maze[i][j] = new MazeNode(data, i, j);
    }

    /**
     * 修改迷宫所有节点四个方向的行走状态信息
     */
    public void initMazeNodePathState() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 值为1的节点方向状态不用调整，因为走不到
                if (this.maze[i][j].val == 1) {
                    continue;
                }

                if (j < col - 1 && this.maze[i][j + 1].val == 0) {
                    this.maze[i][j].state[Constant.RIGHT] = true;
                }

                if (i < row - 1 && this.maze[i + 1][j].val == 0) {
                    this.maze[i][j].state[Constant.DOWN] = true;
                }

                if (j > 0 && this.maze[i][j - 1].val == 0) {
                    this.maze[i][j].state[Constant.LEFT] = true;
                }

                if (i > 0 && this.maze[i - 1][j].val == 0) {
                    this.maze[i][j].state[Constant.UP] = true;
                }
            }
        }
    }

    /**
     * 寻找迷宫路径
     */
    public void findMazePath(int beginX, int beginY, int endX, int endY) {
        if (maze[beginX][beginY].val == 1) {
            return;
        }

        queue.offer(maze[beginX][beginY]);
        while (!queue.isEmpty()) {
            MazeNode top = queue.peek();
            int x = top.x;
            int y = top.y;

            // 往右方向走
            if (maze[x][y].state[Constant.RIGHT]) {
                maze[x][y].state[Constant.RIGHT] = false;
                maze[x][y + 1].state[Constant.LEFT] = false;
                if (x == endX - 1 && y == endY - 1) { // 判断是否找到了右下角出口节点，找到的话直接退出
                    System.out.print("1");
                    break;
//                    return;
                }
                queue.offer(maze[x][y + 1]);
                pathrecord[x * col + y + 1] = maze[x][y];
            }

            // 往下方向走
            if (maze[x][y].state[Constant.DOWN]) {
                maze[x][y].state[Constant.DOWN] = false;
                maze[x + 1][y].state[Constant.UP] = false;
                if (x == endX - 1 && y == endY - 1) { // 判断是否找到了右下角出口节点，找到的话直接退出
                    System.out.print("2");
                    break;
//                    return;
                }
                queue.offer(maze[x + 1][y]);
                pathrecord[(x + 1) * col + y] = maze[x][y];

            }

            // 往左方向走
            if (maze[x][y].state[Constant.LEFT]) {
                maze[x][y].state[Constant.LEFT] = false;
                maze[x][y - 1].state[Constant.RIGHT] = false;
                if (x == endX - 1 && y == endY - 1) { // 判断是否找到了右下角出口节点，找到的话直接退出
                    System.out.print("3");
                    break;
//                    return;
                }
                queue.offer(maze[x][y - 1]);
                pathrecord[x * col + y - 1] = maze[x][y];
            }

            // 往上方向走
            if (maze[x][y].state[Constant.UP]) {
                maze[x][y].state[Constant.UP] = false;
                maze[x - 1][y].state[Constant.DOWN] = false;
                if (x == endX - 1 && y == endY - 1) { // 判断是否找到了右下角出口节点，找到的话直接退出
                    System.out.print("4");
                    break;
//                    return;
                }
                queue.offer(maze[x - 1][y]);
                pathrecord[(x - 1) * col + y] = maze[x][y];

            }

            queue.poll();
        }
    }

    /**
     * 检查是否找到右下角出口的节点
     *
     * @param x
     * @param y
     * @return
     */
    private boolean check(int x, int y, int endX, int endY) {
        return x == endX - 1 && y == endY - 1;
    }

    /**
     * 打印迷宫路径搜索的结果
     */
    public void showMazePath(int endx, int endy) {
        System.out.println("迷宫路径搜索结果如下：");
//        if(pathrecord[row*col-1] == null){
        if (0 == 1) {
            System.out.println("迷宫不存在有效路径");
        } else {
            int x = endx - 1;
            int y = endy - 1;
            for (; ; ) {
                maze[x][y].val = '*';
                MazeNode node = pathrecord[x * col + y];
                if (node == null) {
                    break;
                }
                x = node.x;
                y = node.y;
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (maze[i][j].val == '*') {
                        System.out.print("✅" + " ");
                    } else if (0 == maze[i][j].val) {
                        System.out.print("💎" + " ");
                    } else {
                        System.out.print("🧱 ");
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * 描述: 定义迷宫节点类型
     */
    public static class MazeNode {
        // 节点的值
        int val;
        // 节点的x和y坐标
        int x;
        int y;
        // 节点四个方向的行走状态，true表示可以走，false表示不能走
        boolean[] state;

        /**
         * 迷宫路径初始化
         *
         * @param data
         * @param i
         * @param j
         */
        public MazeNode(int data, int i, int j) {
            this.state = new boolean[4];
            this.val = data;
            this.x = i;
            this.y = j;
        }

        public int getVal() {
            return val;
        }
    }
}

