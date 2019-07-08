package ArrayRelated;

public class array_delete {
    public  static void  main(String[] args){
        //测试，给空集
        int array1[]={1,2,3,4,5,6,7,8,9};
        int array2[]={};

        //1
        array_delete a=new array_delete();
        int[] ans = a.delete_item(4,array1);
        for (int i =0;i<ans.length;i++){
            System.out.print(ans[i]+"\t");

        }
        System.out.print("\n");


        //2
        int[] ans1 = a.delete_item(0,array2);
        System.out.println(ans1);




        //deletechar
        String str="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str);
        String ans2=a.delete_char(str,25);
        System.out.println(ans2);

    }

    //通过数组的拷贝实现删除元素
    public  int[] delete_item(int index,int[] array){
        if (array.length==0){
            return null;
        }
        if (index>array.length-1 || index<0){
            return null;
        }
       int[] array_copy = new int[array.length-1];
       System.arraycopy(array,0,array_copy,0,index);
       System.arraycopy(array,index+1,array_copy,index,array.length-1-index);
       return array_copy;
    }


    public  String delete_char(String str,int index){
        if (str==""){
            return null;
        }
        else if(index==str.length()) {
            return null;
        }
        String original[]= new String[str.length()];
        String copy[]=new String[str.length()-1];

        for(int i=0;i<original.length;i++){
            original[i]=str.substring(i,i+1);
        }


        System.arraycopy(original,0,copy,0,index);
        System.arraycopy(original,index+1,copy,index,original.length-1-index);

        System.out.print("\n");
        String returnnString="";
        for(int i =0;i<copy.length;i++){
            returnnString=returnnString+copy[i];
        }

        return returnnString;


    }
}

