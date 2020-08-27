package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collector;

public class GUI{


    Map GUIMap=new Map("../MapData/map.txt");
    int[][] GUITempMap= GUIMap.map;
//    Cell[][]  board;
    Label label[][];
    public GUI(){}

        void display(){
            init();
          }
    public void UpdateMap(){
            for(int i=0;i<25;i++){
                for(int j=0;j<25;j++){
                    if(GUIMap.map[i][j]==3){
                        label[i][j].setBackground(Color.BLUE);
                    }if(GUIMap.map[i][j]==0){
                        label[i][j].setBackground(Color.white);
                    }else label[i][j].setBackground(Color.ORANGE);
//                    if(label[i][j].getBackground()==Color.ORANGE){
//                        GUITempMap[i][j]=1;
//                    }else GUITempMap[i][j]=0;
                }
            }
    }
    public void init(){
        JFrame w= new JFrame("迷宫游戏");
        w.setSize(1100,700);
        w.setLocation(100,100);
        w.setLayout(null);

        JPanel jPanelBegin=new JPanel();
        jPanelBegin.setLayout(null);
        Border titleBorder1=BorderFactory.createTitledBorder("起点设置");
        jPanelBegin.setBorder(titleBorder1);
        jPanelBegin.setSize(200,70);
        jPanelBegin.setLocation(675,20);
        JLabel label1=  new JLabel("起点x(1到25)");
        label1.setSize(100,50);
        label1.setLocation(15,0);
        JLabel label2=  new JLabel("起点y(1到25)");
        label2.setSize(100,50);
        label2.setLocation(110,0);
        JTextArea jTextArea1=new JTextArea();
        jTextArea1.setSize(50,17);
        jTextArea1.setLocation(15,35);
        JTextArea jTextArea2=new JTextArea();
        jTextArea2.setSize(50,17);
        jTextArea2.setLocation(110,35);
        jPanelBegin.add(label1);
        jPanelBegin.add(label2);
        jPanelBegin.add(jTextArea1);
        jPanelBegin.add(jTextArea2);
        jPanelBegin.add(new TextArea());

        JPanel jPanelEnd=new JPanel();
        jPanelEnd.setLayout(null);
        Border titleBorder2=BorderFactory.createTitledBorder("终点设置");
        jPanelEnd.setBorder(titleBorder2);
        jPanelEnd.setSize(200,70);
        jPanelEnd.setLocation(875,20);
        JLabel label3=  new JLabel("终点x(1到25)");
        label3.setSize(100,50);
        label3.setLocation(15,0);
        JLabel label4=  new JLabel("终点y(1到25)");
        label4.setSize(100,50);
        label4.setLocation(110,0);
        JTextArea jTextArea3=new JTextArea();
        jTextArea3.setSize(50,17);
        jTextArea3.setLocation(15,35);
        JTextArea jTextArea4=new JTextArea();
        jTextArea4.setSize(50,17);
        jTextArea4.setLocation(110,35);
        jPanelEnd.add(label3);
        jPanelEnd.add(label4);
        jPanelEnd.add(jTextArea3);
        jPanelEnd.add(jTextArea4);
        jPanelEnd.add(new TextArea());


        JPanel jPanelControl=new JPanel();
        jPanelControl.setLayout(null);
        Border titleBorder3=BorderFactory.createTitledBorder("控制");
        jPanelControl.setBorder(titleBorder3);
        jPanelControl.setSize(400,400);
        jPanelControl.setLocation(675,90);
        JButton loadButton = new JButton("加载迷宫");
//            JFileChooser loadButton = new JFileChooser()
        loadButton.setSize(100,50);
        loadButton.setLocation(90,50);
//        loadButton.
        JButton modifyButton = new JButton("修改迷宫");
        modifyButton.setSize(100,50);
        modifyButton.setLocation(215,50);
        JButton saveButton = new JButton("保存迷宫");
        saveButton.setSize(100,50);
        saveButton.setLocation(90,115);
        JButton startButton = new JButton("START");
        startButton.setSize(100,50);
        startButton.setLocation(215,115);
        JButton upControl = new JButton("上(w)");
        upControl.setSize(100,50);
        upControl.setLocation(155,185);
        JButton downControl = new JButton("下(s)");
        downControl.setSize(100,50);
        downControl.setLocation(155,245);
        JButton leftControl = new JButton("左(a)");
        leftControl.setSize(100,50);
        leftControl.setLocation(45,245);
        JButton rightControl = new JButton("右(d)");
        rightControl.setSize(100,50);
        rightControl.setLocation(265,245);

        JLabel label5=new JLabel("运行步数:");
        label5.setSize(60,40);
        label5.setLocation(145,330);
        JTextArea stepNumber=new JTextArea("0");
        stepNumber.setSize(40,20);
        stepNumber.setLocation(205,340);
        jPanelControl.add(stepNumber);
        jPanelControl.add(loadButton);
        jPanelControl.add(modifyButton);
        jPanelControl.add(saveButton);
        jPanelControl.add(startButton);
        jPanelControl.add(upControl);
        jPanelControl.add(downControl);
        jPanelControl.add(leftControl);
        jPanelControl.add(rightControl);
        jPanelControl.add(label5);




        saveButton.addActionListener(new SaveButtonListener());
        modifyButton.addActionListener(new ModifyButtonListener());
        label=new Label[25][25];





//        w.add(label);
//        w.setb
        for(int i=0;i<25;i++){
            for(int j=0;j<25;j++){
                label[i][j]=new Label();
                if(GUIMap.map[i][j]==0)
                    label[i][j].setBackground(Color.white);
                else label[i][j].setBackground(Color.ORANGE);
                label[i][j].setSize(25,25);
                label[i][j].setLocation(i*25+25,j*25+25);
                MouseAdp mouseAdp=new  MouseAdp();
                label[i][j].addMouseListener(mouseAdp);
                mouseAdp.SetLabel(label[i][j]);
                w.add(label[i][j]);
            }
        }
        w.add(jPanelEnd);
        w.add(jPanelBegin);
        w.add(jPanelControl);
        w.setVisible(true);
    }
    class ModifyButtonListener implements ActionListener{
        @Override
    public void actionPerformed(ActionEvent e) {
            for(int i=0;i<25;i++){
                for(int j=0;j<25;j++){
                    if(label[i][j].getBackground()==Color.ORANGE){
                        GUITempMap[i][j]=1;
                    }else GUITempMap[i][j]=0;
                    GUIMap.map[i][j]=GUITempMap[i][j];
                }
            }

    }}
    class SaveButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            GUIMap.SavaMapToFile(GUIMap.mapPath,GUIMap.map);
        }}
    class StartButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            GUIMap.FindBestPath(0,0,24,24);
        }}
    public void setGUITempMap(int[][] GUITempMap) {
        this.GUITempMap = GUITempMap;
    }
}
