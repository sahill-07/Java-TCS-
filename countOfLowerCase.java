// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class countOfLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                count++;
                System.out.println(s.charAt(i));
            }
        }
        System.out.println(count);
    }
}