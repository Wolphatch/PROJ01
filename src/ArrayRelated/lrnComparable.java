package ArrayRelated;

public class lrnComparable {
    public static void  main(String[] args){
        Man man1=new Man(15,12,"Smith");
        Man man2=new Man(15,13,"John");
        System.out.println(man1.toString());
        System.out.println(man1.compareTo(man2));

    }



}


class Man implements Comparable{
    int age;
    String name;
    int id;

    public Man(int age,int id,String name){
        super();
        this.age=age;
        this.name=name;
        this.id=id;
    }



    public String toString(){
        return this.name;
    }


    public int compareTo(Object o){
        Man obj = (Man) o;
        if (this.age<=obj.age){
            return -1;
        }
        else{
            return 1;
        }
    }
}