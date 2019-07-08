package lrnDate;


import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class calendarDisplay {
    public static void main(String[] args) throws ParseException {

        /**read date
         *
         */
        System.out.println("请输入日期");
        Scanner scanner=new Scanner(System.in);
        String date=scanner.nextLine();

        /**
         * 输入结果读取
         */
        System.out.format("您刚才输入的日期是：%s",date);
        System.out.println();

        /**
         *
         */
        System.out.println("日     一      二     三     四     五      六");

        /**
         * 转换输入结果calendar
         */

        Integer Month=Integer.parseInt(date.substring(5,7));
        Integer Day=Integer.parseInt(date.substring(8,10));
        Integer Year=Integer.parseInt(date.substring(0,4));

        Calendar calendar=new GregorianCalendar(Year,Month-1,Day);
        Calendar firstDay=new GregorianCalendar(Year,Month-1,1);
        int firstDayDayInMonth=firstDay.get(firstDay.DAY_OF_WEEK);
        int start=firstDayDayInMonth;




        for(int i=1;i<=50;i++){
            if(i==start) {
                if (firstDay.get(firstDay.MONTH) == calendar.get(calendar.MONTH)) {
                    System.out.print(firstDay.get(firstDay.DAY_OF_MONTH));
                    System.out.print("     ");
                    if(firstDay.get(firstDay.DAY_OF_MONTH)<10){
                        System.out.print(" ");
                    }
                    firstDay.add(Calendar.DATE, 1);
                    if (firstDay.get(firstDay.DAY_OF_WEEK) == 1) {
                        System.out.println("\n");
                    }
                } else {
                    break;

                }
                start+=1;
            }
            else{
                System.out.print("       ");
            }




        }



    }
}


