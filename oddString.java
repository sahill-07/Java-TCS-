import  java.util.*;
public class oddString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "" ;
        for(int i = 1 ; i < s.length() ; i+=2){
            ans += s.charAt(i);
        }

        System.out.println(ans);
    }
}
