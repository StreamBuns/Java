//package guiThread;

import com.company.EX1;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TestAni  {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TestAni frame = new TestAni();
                    frame.contentPane.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    class AniThread extends Thread{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            JLabel l = new JLabel((char) ('A' + (int) (Math.random() * 26))
                    + "");
            contentPane.add(l);
            l.setBounds((int) (Math.random() * 750), 0, 50, 50);
            for (int i=0;i<600;i++){
                l.setLocation(l.getX(),i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }
    public TestAni() {
        JFrame frame = new JFrame("Ex4_3");
        frame.setContentPane(new TestAni().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(200,200,800,600);
        frame.setTitle("\u6253\u5B57\u6E38\u620F");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(200, 200, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("\u5F00\u59CB");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AniThread().start();
                new AniThread().start();
                new AniThread().start();
            }
        });
        btnNewButton.setBounds(300, 500, 200, 50);
        contentPane.add(btnNewButton);
    }
}
