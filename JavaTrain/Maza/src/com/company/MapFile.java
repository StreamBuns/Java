package com.company;

import java.io.*;

public interface MapFile {
    int MaxWidth=25;
    int MaxHight=25;

    public default int [][] LoadMapFromFile(String mapPath){
        int [][] map = new int[MaxHight][MaxWidth];
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
                    map[i][j]= inData.readInt();
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("加载文件出错");
        }
        return map;
    };
    public default boolean SavaMapToFile(String mapPath,int [][] map){
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
                    outData.writeInt(map[i][j]);
                    System.out.print(map[i][j]+" ");
                }
                System.out.println();
            }

        }catch(Exception e){
            System.out.println("加载文件出错");
        }
        return true;
    };
}
