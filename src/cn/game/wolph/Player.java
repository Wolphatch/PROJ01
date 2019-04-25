package cn.game.wolph;

import java.util.concurrent.TimeUnit;

public class Player {
    public static void  main(String[] args){

    }

    int position;
    String name;
    int Score;

    public Player(String name){
        this.name=name;
        this.position=0;
        this.Score=0;
        System.out.println(this.name+" is playing!\n");
    }

    public  int letsDice(){
        int dice_num=Dice.dice();
        this.position+=dice_num;
        System.out.println("Dicing....\n");
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (Exception e){

        }
        System.out.println("Dice result of "+this.name+" is "+dice_num+"\n");
        return  this.position;
    }
}
