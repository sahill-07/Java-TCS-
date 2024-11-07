// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class removeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        String ans = "" ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ch){
                ans += s.charAt(i); 
            }
        }
        System.out.println(ans);
    }
}