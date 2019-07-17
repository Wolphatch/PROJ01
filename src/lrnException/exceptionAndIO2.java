package lrnException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionAndIO2 {

    public static void main(String[] args) throws IOException{
        readMyFile("D:/PROJ01/src/lrnException/infile.txt") ;
    }


    public static void readMyFile(String fileName) throws IOException{
        FileReader reader= null;
        reader=new FileReader(fileName);
        char l1=(char)reader.read();  //只读一个char
        char l2=(char)reader.read();
        System.out.println(l1+""+l2);
        if(reader!=null) {
            reader.close();
        }

    }
}
