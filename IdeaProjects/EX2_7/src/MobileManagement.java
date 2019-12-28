import javax.swing.JOptionPane;

public class MobileManagement {
    /** Defines the entry point of the application. */
    public static void main(String[] args) {
        // Creates two mobile phone objects.
        Mobile mobile1 =  new Mobile("E365",1780);
        Mobile mobile2 =  new Mobile("E330",1450)                             ;

        // Displays the two mobile phones in a dialog box.
//        JOptionPane.showMessageDialog("Moblie phones");
        JOptionPane.showMessageDialog(null,"Mobile phones:"+"\n"+mobile1.getName()+":"+mobile1.getPrice()+"RMB"+
                                                                                      "\n"+mobile2.getName()+":"+mobile2.getPrice()+"RMB"+
                                                                                          "\n"+"\n"+"There are two mobile phones");

    }
}