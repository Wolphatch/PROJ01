package cn.game.wolph;

import  java.math.*;

public class Dice {
    public static void main(String[] args){
        System.out.println(dice());
    }

    public static int dice(){
        int dice_num=(int)(6*Math.random()+1);
        return dice_num;
    }

}
