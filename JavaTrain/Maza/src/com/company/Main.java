package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Maze maze = new Maze("../MapData/map.txt");
//        Maze maze = new Maze(25,25);
//        maze=maze.LoadMapFromFile("../MapData/map.txt");
        // 修改迷宫所有节点四个方向的行走状态信息
        maze.initMazeNodePathState();
        // 寻找迷宫路径
        maze.findMazePath(4, 0, 7, 5);
        // 打印迷宫路径搜索的结果
        maze.showMazePath(7, 5);
        GUI gui = new GUI();
        gui.display();
        System.out.println("Hello World!");
    }


}
