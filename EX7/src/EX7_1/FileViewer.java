package EX7_1;

import java.io.FileReader;
import java.io.IOException;
public class FileViewer {
    /** Defines the entry point of the program. */
    public static void main(String[] args) {
        System.out.println("Please enter the file path:");
        try {
            String fileName = "";
            while(true) {
               int readByte = System.in.read();
               if(readByte == -1 || readByte == '\n')
                    break;
               fileName += (char) readByte;
            }
            //获取文件路径
            // Reads the file and prints it to the System.out stream.
            char[] buffer = new char[20];
            FileReader reader = new FileReader(fileName);//新建文件类型对象
            while(true) {
                int length = reader.read(buffer);
                if(length < 0) // Reads a long as there is more data.
                    break;
                String text = new String(buffer, 0, length);
                System.out.print(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
