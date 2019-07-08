package ArrayRelated;

public class array_copy {
    public  static void  main(String[] args){

        int[] original={1,2,3,4,5,6,7,8,9,10};
        int copy[]=new int[original.length];
        int copy2[]=new int[original.length];
        //1.使用System.arraycopy(original,posiiton,copy,position,length)

        System.arraycopy(original,0,copy,1,original.length-1);
        for (int i:copy){
            System.out.print(i+"\t");
        }
        System.out.println("\n");

        //2.传统办法
        for (int i=0 ;i<original.length;i++){
            copy2[i]=original[i];
        }
        for (int i:copy){
            System.out.print(i+"\t");
        }

    }
}
