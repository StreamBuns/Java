import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mysql {
    private JPanel panel1;
    private JButton deleteb = new JButton();
    private JButton updatab = new JButton();
    private JButton selectb = new JButton();
    private JTextArea idtextArea = new JTextArea();
    private JTextArea agetextArea=new JTextArea();
    private JTextArea nametextArea = new JTextArea();
//    textArea1.setHorizontalAlignment(JTextField.RIGHT);
    public Mysql()
    {
        JFrame frame = new JFrame("Mysql");
        frame.setContentPane(new Mysql().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        deleteb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }


    public static void main(String[] args) throws Exception {

       new Mysql();

    }
}
