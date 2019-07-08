package StringRelated;

public class lrnString {
    //String是不可变的字符序列

    public static void main(String[] args){
        String str1="abc"+"efg";
        String str2="18"+19;
        String str3="asdfg";
        String str4="asdfg";
        String str5 = new String("asdfg");
        String str6="eneouvnoqivnqwv08";
        String str7="EneouVnoqiVnqwv08";
        String str8="  EneouVno  qiVnqwv08   ";

        /*
        System.out.println(str3==str4);
        System.out.println(str3==str5);
        System.out.println(str3.equals(str5));
         */

        //方法们
        char charat=str6.charAt(5);
        boolean ifeq= str5.equals(str4);
        boolean ifeqNcase= str6.equalsIgnoreCase(str7);
        int indxof = str6.indexOf('V');
        int indxoflast= str6.lastIndexOf('V');
        System.out.println(str7.length());
        boolean stwith=str7.startsWith("Ene");
        System.out.println(stwith);
        System.out.println(str7.endsWith("08"));
        String substr=str7.substring(0,15);
        System.out.println(substr);
        String lower=str7.toLowerCase();
        System.out.println(lower);
        String trimstr=str8.trim();
        System.out.println(trimstr);
    }
}
