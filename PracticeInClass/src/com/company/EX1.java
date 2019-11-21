package com.company;

import javax.swing.*;

public class EX1 {
    private JPanel panel1;
    private JButton 确定Button;


        public void actionPerformed(Action e) {
            EX1Thread e1 = new EX1Thread();

//			textField.setText("0");
        }
   public EX1()
    {

    }

    class EX1Thread extends  Thread
    {
        public void run()
        {
            super.run();

            JLabel l = new JLabel((char)('A'+(int)(Math.random()%26))+" ");
            panel1.add(l);

            for(int i =0;i<600;i++)
            {
                l.setLocation(l.getX(),i);
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }


}
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ex4_3");
        frame.setContentPane(new EX1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(200,200,800,600);

    }
}