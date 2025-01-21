import java.util.Scanner;

public class Main {

    public String solution(String s){

       String ret = "";

       for(String x: s.split(" ")){
           if(x.length() > ret.length()) ret = x;
       }

        return ret;
    }

    public static void main(String[] args){
        Main sol = new Main();
        Scanner in=new Scanner(System.in);

        String input1 = in.nextLine();
        System.out.println(sol.solution(input1));
        return ;
    }
}