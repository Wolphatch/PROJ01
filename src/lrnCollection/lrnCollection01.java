package lrnCollection;

import java.util.*;

/**
 * set:HashSet  not ordered, no repetitive
 * list:ArrayList,LinkedList   ordered, repeatable
 * map:HashMap
 */


public class lrnCollection01 {
    public static void main(String[] args){


        Collection<Integer> lst = new ArrayList<Integer>();
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());


        //add
        lst.add(11111);
        lst.add(11112);
        System.out.println(lst);   //默认调用toString


        //toArray
        Object[] obj =lst.toArray();
        System.out.println(obj);

        //contain return boolean
        boolean ifLstContain=lst.contains(11111);
        System.out.println(ifLstContain);

        //remove
        lst.remove(11111);      //remove参数不是index
        System.out.println(lst);


        //clear
        lst.clear();
        System.out.println(lst.size());




    }
}
