package EX7_2;

import java.io.*;
import java.io.FileNotFoundException;

public class FileRWTest {
    public static void main(String[] args) {
        try {
            File filein = new File("input.txt");
            File fileout = new File("output.txt");
            FileInputStream fin = new FileInputStream(filein);
            FileOutputStream fout = new FileOutputStream(fileout);
            if(filein.isFile())
            {
                System.out.println("File Location : "+filein.getAbsolutePath());
                if(filein.canRead())
                {
                    System.out.println("File can be read.");
                    try {
                        char read;;
                        int i =0;
                        while (fin.available() > 0) {
                            fout.write((char)fin.read());
                        }
                        System.out.println();
                        fin.close();
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else{
                    System.out.println("File can not be read.");
                }
            }
            else{
                System.out.println("This is not a file.");
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
