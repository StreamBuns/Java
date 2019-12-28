package cn.edu.nwsuaf.jp.p4;
import java.util.Arrays;
import javax.swing.JOptionPane;
import cn.edu.nwsuaf.jp.p4.data.Mobile;
import cn.edu.nwsuaf.jp.p4.data.Mp3Player;
import cn.edu.nwsuaf.jp.p4.data.Product;
public class Store {
    //** Defines the entry point of the application. */
    public static void main(String[] args) {

        // Creates two mobile phone objects.

        Mobile mobile1 = new Mobile("China Mobile", "E365",1780);
        Mobile mobile2 = new Mobile("China Mobile", "M330",1450);
        Mp3Player player1 = new Mp3Player("Meizo X3", 256, 399);
        Mp3Player player2 = new Mp3Player("Meizo E5", 512, 580);
        Mp3Player player3 = new Mp3Player("Xlive XM MP3 Play",256, 930);
        Product[] products={mobile1,mobile2,player1,player2, player3};
        Arrays.sort(products);
        String text = "";
        for(int index = 0; index <products.length; ++index)
//            if(products[index].toString()=="cn.edu.nwsuaf.jp.p4.data.Mobile")
            if(products[index].getType() == "Mobile")
            text +=
 products[index].getName()+" on "+products[index].getCounty()+","+products[index].getPrice()+"RMB"+"\n";
            else{text+=
 products[index].getName()+"("+products[index].getRAM()+"MB)"+products[index].getCounty()+","+products[index].getPrice()+"RMB"+"\n";
            }
//  Displays the two mobile phones in a dialog box.
        JOptionPane.showMessageDialog(null,"The products are:\n\n"+text+"\nThere are "+Product.getCount()
                +" products.");

    }
}
//        JOptionPane.showMessageDialog(null,"The products are:\n\n"+text+"There are