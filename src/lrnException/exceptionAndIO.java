package lrnException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exceptionAndIO {

    public static void main(String[] args){
        readMyFile("D:/PROJ01/src/lrnException/infile.txt");
    }



    public static void readMyFile(String fileName){
        FileReader reader= null;
        try{
            reader=new FileReader(fileName);
            char l1=(char)reader.read();  //只读一个char
            char l2=(char)reader.read();
            System.out.println(l1+""+l2);
        }catch (FileNotFoundException e){ //FileNotFoundException是IOExpection的子类，在前执行
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(reader!=null) {
                    reader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
