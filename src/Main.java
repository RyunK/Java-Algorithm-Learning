import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public String solution(String s){

        char[] arr = s.toCharArray();
        int idx = 0;

        while(idx < arr.length){
            if(arr[idx] != ' '){
                for(int j=idx+1; j<arr.length; j++){
                    if(arr[idx] == arr[j]) {
                        arr[j] = ' ';
                    }
                }
            }
            idx ++;
        }

        String ret = String.copyValueOf(arr);
        ret = ret.replace(" ", "");
        return ret;
    }

    public static void main(String[] args){
        Main sol = new Main();
        Scanner in=new Scanner(System.in);

        String s = in.next();
        System.out.println(sol.solution(s));
        return ;
    }
}