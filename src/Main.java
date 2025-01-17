import java.util.Scanner;

public class Main {

    public String solution(String s){

        StringBuilder ret_builder = new StringBuilder();
        char temp;

        for(int i=0; i<s.length();i++) {
            temp = s.charAt(i);

            if (Character.isUpperCase(temp)) {
                temp = Character.toLowerCase(temp);
                ret_builder.append(temp);
            } else {
                temp = Character.toUpperCase(temp);
                ret_builder.append(temp);
            }
        }

        String ret = ret_builder.toString();
        return ret;
    }

    public static void main(String[] args){
        Main sol = new Main();
        Scanner in=new Scanner(System.in);

        String input1 = in.next();
        System.out.println(sol.solution(input1));
        return ;
    }
}