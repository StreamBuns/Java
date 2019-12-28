package EX7_3;



import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTranslate{
    public static void main(String[] args) {
        try {
            FileReader filein = new FileReader("input.txt");
            FileWriter fileout = new FileWriter("result.txt");
            BufferedReader bin = new BufferedReader(filein);
            BufferedWriter bout = new BufferedWriter(fileout);
            int anumber=0,Anumber=0,i=0;
            String str;
            char[] read=new char[50];
            while((str=bin.readLine())!=null)
            {
               read = str.toCharArray();
               while(i<read.length)
               {
                   if(read[i]>='A'&&read[i]<='z')
                   {
                       if(read[i]>='A'&&read[i]<='Z')
                       {
                           Anumber++;
                       }
                       if(read[i]>='a'&&read[i]<='z')
                       {
                           anumber++;
                           read[i] -=32;
                       }
                   }
//                   bout.write(read[i]);
                   i++;
//                            bout.write(read);
               }
                bout.write(read);
                bout.write("\n");
               i=0;
            }
            System.out.println("小写字母共："+anumber+"\n大写字母共："+Anumber);
            bin.close();
            bout.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
