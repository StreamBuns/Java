package Test2;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        // write your code here
        try {
            FileReader filR = new FileReader("input.txt");
            FileWriter filW = new FileWriter("output.txt");
            BufferedReader bin = new BufferedReader(filR);
            BufferedWriter bout =  new BufferedWriter(filW);
            int anumber=0,number=0,Anumber=0,i=0;
            String str;
            char read[]=new char[50];
            while((str = bin.readLine())!=null){
                read = str.toCharArray();
                for(i=0;i<read.length;i++){
                    if(read[i]>='A'&&read[i]<='Z'){
                        Anumber++;
                    }
                    if(read[i]>='a'&&read[i]<='z'){
                        anumber++;
                        read[i] -= 32;
                    }
                    if(read[i]>='0'&&read[i]<='9'){
                        number++;
                    }
                    bout.write(read[i]);
                }

            }
            System.out.println("小写字母"+anumber+"大写字母"+Anumber+"数字"+number);
            bin.close();;
            bout.close();
//            while(in.)

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
