package lrnException;

/**
 * @author
 * java's exception
 */
public class lrnException {
    public static void main(String[] args){
        String st=null;
        lrnNullPointerException(st);

        Dog dg=new Dog();
        lrnCastException(dg);

        int[] arr={1,2,3,4,5,5,6,7};
        arrayOutOfRange(arr);
    }




    /*1.空指针异常*/

    public static void lrnNullPointerException(String a){
        try{
            System.out.println(a.length());
        }catch(Exception e){    //如果有异常
            System.out.println("nullPointerException");
        }

    }


    /*2.强制转型异常*/
    public static void lrnCastException(Dog a){
        try{
            Animal am=a;
            Cat ct=(Cat)am;  //父类实例am其实是其子类Dog，Dog不能转型为Cat
        }catch(Exception e){
            System.out.println("castException");
        }

    }

    /*数组越界异常*/
    public static void arrayOutOfRange(int[] a){
        try{
            for(int b=0;b<10;b++){
                System.out.print(a[b]+"\t");

            }
        }catch (Exception e){
            System.out.println();
            System.out.println("indexOutOfRange");
        }
    }





}


class Animal{

}


class Dog extends Animal{

}

class Cat extends Animal{

}