package cn.game.wolph;
import cn.game.wolph.Player;
import cn.game.wolph.Dice;
import cn.game.wolph.Game;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    public static void main(String[] args) {
        Game a = new Game();
        Player computer= new Player("Computer");
        //键入palyer的name，并生成实例
        System.out.println("Player's name:");
        Scanner name = new Scanner(System.in);  //接受键盘输入
        String input = name.nextLine();          //转化为String
        Player gmPlayer= new Player(input);        //实例化玩家
        //Start
        start();

        //play
        a.play(computer,gmPlayer);


    }


    String[] platform;


    public Game(){



        this.platform=new String[20];
        for (int i=0;i<=19;i++) {
            platform[i] = "_";
        }
        platform[0]="S";
        platform[19]="F";
        printPlatfrom(platform);

    }

    public  void play(Player a,Player b){
       int position_a=a.letsDice();
       int position_b=b.letsDice();
       String[] plt=configurePlatfrom(position_a,position_b);
       printPlatfrom(plt);

    }




    public static void start(){
        //Start
        System.out.println("Press anything to start");
        Scanner start = new Scanner(System.in);
        String st = start.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {

            }
        }
    }




    public static void printPlatfrom(String[] list){
        for (int i=0;i<=19;i++){
            System.out.print(list[i]+"\t");
        }
        System.out.print("\n");
        System.out.print("\n");
    }


    public String[] configurePlatfrom(int hp,int cp){   //hp=position of human ..

        platform[0]="S";
        platform[19]="F";


        if (hp==cp & hp!=0){            //hp和cp同位
            platform[hp]="HC";

            return platform;
        }
        else if (hp==cp & hp==0){
            platform[0]="HC";

            return platform;
        }
        else if(hp==cp & hp==19){
            platform[0]="HC";

            return platform;
        }

        if (hp!=cp && hp==0){
            platform[0]="H";
            platform[cp]="C";

            return platform;
        }
        else if (hp!=cp && cp==0){
            platform[0]="C";
            platform[cp]="H";

            return platform;
        }
        else if (hp!=cp && cp!=0 && hp!=0){
            platform[cp]="C";
            platform[hp]="H";

            return platform;
        }

        return  platform;
    }


}
