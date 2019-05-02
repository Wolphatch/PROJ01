package oop_package2;

/**
 * @author zhicong hu
 *
 */
public class Person4Encapsulation {
    private int id;
    private String name;
    private int age;            //类属性全部私有
    private boolean man;

    public void setName(String name){   //setName的方法，用于访问私有属性name
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public int setAge(int age){
        if(age>=0 && age<=130){
        this.age=age;
        }
        else{
            System.out.println("Invaild age, try again!\n");
            return 0;
        }
        return this.age;
    }

    public void setMan(boolean man){
        this.man=man;
    }
}

