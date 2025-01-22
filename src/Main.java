import java.util.Scanner;

public class Main {

    public String solution(String s){

       char[] chararr = s.toCharArray();
       int lt = 0, rt = s.length()-1;

       while (lt<rt) {
           if(Character.isLetter(chararr[lt]) && Character.isLetter(chararr[rt])) {
               char tmp = chararr[lt];
               chararr[lt] = chararr[rt];
               chararr[rt] = tmp;
               lt++;
               rt--;
           } else if (Character.isLetter(chararr[lt])) {
               rt --;
           } else if (Character.isLetter(chararr[rt])) {
               lt++;
           }
           else {
               lt++;
               rt--;
           }

       }

        return String.copyValueOf(chararr);
    }

    public static void main(String[] args){
        Main sol = new Main();
        Scanner in=new Scanner(System.in);

        String s = in.next();
        System.out.println(sol.solution(s));
        return ;
    }
}