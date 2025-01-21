import java.util.Scanner;

public class Main {

    public String solution(String s){

       String ret = "";

       for(int i=s.length(); i>0; i--){
           ret = ret + s.charAt(i-1);
       }

        return ret;
    }

    public static void main(String[] args){
        Main sol = new Main();
        Scanner in=new Scanner(System.in);

        int cnt = in.nextInt();

        for(int i=0; i<cnt; i++){
            String tmp = in.next();
            System.out.println(sol.solution(tmp));
        }
        return ;
    }
}