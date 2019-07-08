package leetcode;

import java.util.*;

public class roman_transfer_13 {
    public static void main(String[] args){
        int a=solution("MCDLXXVI");

    }
    public static int solution(String s){
        int sum=0;
        //A arrayList split the input string in to list
        List<String> s_list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String w=s.substring(i,i+1);
            s_list.add(w);
        }
        int i=0;
        while(i<s_list.size()){

            if (i+1!=s_list.size() && rNumberTransfer(s_list.get(i))<rNumberTransfer(s_list.get(i+1))){
                sum=sum+rNumberTransfer(s_list.get(i+1))-rNumberTransfer(s_list.get(i));

                i+=2;
            }
            else{
                sum=sum+rNumberTransfer(s_list.get(i));
                i+=1;
            }

        }
        return sum;
    }

    public static int rNumberTransfer(String a){
        switch (a) {
            case "I":
                return 1;

            case "V":
                return 5;

            case "X":
                return 10;
            case  "L":
                return 50;

            case "C":
                return 100;

            case "D":
                return 500;

            case "M":
                return 1000;

        }
        return 0;
    }

}
