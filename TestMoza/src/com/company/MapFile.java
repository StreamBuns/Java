package com.company;


import java.io.*;

public interface MapFile {
    int MaxWidth=25;
    int MaxHight=25;

    public default Maze LoadMapFromFile(String mapPath){
//        int [][] map = new int[MaxHight][MaxWidth];
        Maze maze = new Maze(MaxWidth,MaxHight);

        File mapFile;
        FileInputStream fis;
        DataInputStream inData;
        try {
            mapFile=new File(mapPath);
            fis = new FileInputStream(mapFile);
            inData = new DataInputStream(fis);
            System.out.println(mapFile.getAbsoluteFile());
            System.out.println("准备读入");
            for( int i=0;i<MaxHight;i++){
                for(int j=0;j<MaxWidth;j++){
                    maze.initMazeNode(inData.readInt(),i,j);
                    System.out.print(maze.maze[i][j].val+" ");
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("加载文件出错");
        }
        return maze;
    };
    public default boolean SavaMapToFile(String mapPath,Maze maze){
//       int [][] map = new int[MaxHight][MaxWidth];
        File mapFile;
        FileOutputStream fos;
        DataOutputStream outData;
        try {
            mapFile=new File(mapPath);
            fos = new FileOutputStream(mapFile);
            outData = new DataOutputStream(fos);
            System.out.println(mapFile.getAbsoluteFile());
            System.out.println("准备写入");
            for( int i=0;i<MaxHight;i++){
                for(int j=0;j<MaxWidth;j++){
                    if(maze.maze[i][j].val==1) {
                        outData.writeInt(1);
                    }else outData.writeInt(0);
                    System.out.print(maze.maze[i][j].val + " ");
                }
                System.out.println();
            }

        }catch(Exception e){
            System.out.println("加载文件出错");
        }
        return true;
    };
}
