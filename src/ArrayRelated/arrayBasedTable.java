package ArrayRelated;
import java.util.Arrays;
public class arrayBasedTable {
    public static void main(String[] args){
        Object[] a1={1,2,3,4,5,6};
        Object[] a2={11,12,13,14,15,16};
        Object[] a3={12,23,45,56,67,78};
        Object[][] table =new Object[3][];
        table[0]=a1;
        table[1]=a2;
        table[2]=a3;

        for (int i =0;i<table.length;i++){
            System.out.println(Arrays.toString(table[i]));
        }




    }


}
