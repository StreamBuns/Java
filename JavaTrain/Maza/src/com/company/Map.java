package com.company;

import java.util.Vector;

public class Map implements MapFile{
    public String mapPath;
    int [][] map=new int[MaxHight][MaxWidth];
    public Map(String mapPath){
        this.mapPath=mapPath;
        map=LoadMapFromFile(mapPath);
    }
    void Search(int x,int y){

            int []fx={1,0,-1,0};                    //这个用来控制x轴走动
            int []fy={0,1,0,-1};                    //这个用来控制y轴走动。
            // x动的时候y不动那样就实现了左右移动，
            // 而x不动y动就实现了y轴方向上的移动
            int newx=x,newy=y;
            for(int i=0;i<4;i++){
                newx=x+fx[i];
                newy=y+fy[i];
                if(newx>=0&&newx<MaxHight&&newy>=0&&newy<MaxWidth&&0==map[newx][newy]){
                    map[newx][newy]=3;
                    if(7==newx&&7==newy){
                        PrintPath();
                        map[newx][newy]=0;
                    }
                    else{
                        Search(newx,newy);
                    }
                }

            }
            map[x][y]=0;

    }
    void PrintPath(){
        for(int i=0;i<MaxHight;i++){
            for(int j=0;j<MaxWidth;j++){
                if(3==map[i][j]){
                    System.out.print("✅ ");
                }
                else if(0==map[i][j]){
                    System.out.print("♦️️ ");
                }
                else{
                    System.out.print("🧱 ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    void markPath(Vector<sq> q, int index)
    {
        sq tmp = q.get(index);
        map[tmp.x][tmp.y] = 3;
        if ( 0 == tmp.x && 0 == tmp.y )
        {
            return ;
        }
        else
        {
            markPath(q, tmp.pre);
        }
    }

    void FindBestPath(int beginX,int beginY,int endX,int endY){
        //模仿队列，之所以不用真正的队列，因为后面需要通过下标对队列进行随机访问

        Vector<sq> q = new Vector<>();

        int qh = 0;
        sq fnode=new sq();
        fnode.pre = -1;
        fnode.x = beginX;
        fnode.y = beginY;
        //标记已访问
        map[fnode.x][fnode.y] = -1;
        q.add(fnode);
//        q.push_back(fnode);
        int qe = 1;
        sq tmp;
        int []fx={1,0,-1,0};                    //这个用来控制x轴走动
        int []fy={0,1,0,-1};                    //这个用来控制y轴走动。
        while (qh != qe)
        {
            //出队
            tmp = q.get(qh);
            ++qh;
            int newx, newy;
            for (int k=0;k<4;++k)
            {
                newx = tmp.x + fx[k];
                newy = tmp.y + fy[k];
                if (newx >= 0 && newx<8 && newy>=0 && newy<8 && 0 == map[newx][newy])
                {
                    sq n_node=new sq();
                    n_node.pre = qh - 1;
                    n_node.x = newx;
                    n_node.y = newy;
                    //入队
//                    q.push_back(n_node);
                    q.add(n_node);
                    ++qe;
                    //找到出口，打印
                    if ( endX == newx && endY == newy)
                    {
                        markPath(q, qe-1);
                        PrintPath();
                        return;
                    }
                }
            }
            //maze[tmp.x][tmp.y] = -1;
        }
    }
}
