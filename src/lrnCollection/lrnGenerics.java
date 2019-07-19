package lrnCollection;

public class lrnGenerics {
    public static void main(String[] args){
        /*set
        *if using generic which says the collection must be <String>, all in collection
        * must be String
        */
        MyCollection<String> mc = new MyCollection<String>(5);
        mc.set("Zacarais",0);
        mc.set("8888",1);

        /*get*/

        String b=mc.get(0);






    }
}

/*MyCollection uses generics*/
/*<E> represent this collection's datatype defined while this collection being initialized*/

class MyCollection<E>{
    Object[] objs;

    /**get insert the object to the collection*/
    public void set(E obj,int index){
        objs[index]=obj;
    }
    /**get the object from collection according to the index*/
    public E get(int index){
        return (E)objs[index];
    }


    /*constructor*/
    public MyCollection(int length){
        Object[] obj=new Object[length];
        this.objs=obj;
    }



}