import java.util.Scanner;

public class Main {

    public static int solution(String s, String c){

        s = s.toLowerCase();
        c = c.toLowerCase();

        int ret = 0;

        while(s.contains(c)){
            s = s.substring(s.indexOf(c)+1);
            ret += 1;
        }

        return ret;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
        return ;
    }
}