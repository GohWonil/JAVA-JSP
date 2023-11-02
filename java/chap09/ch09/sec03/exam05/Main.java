package ch09.sec03.exam05;

public class Main {
    public static void main(String[] args) {
       int num = 5;
       char c = 'A';
       String result = 
           num == 5? c == 'A'? "num은 5, c는 A" : "num은 5, c는 A가 아님" : "num은 5가 아님";

       System.out.println(result);
    }
}
