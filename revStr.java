// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class revStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            System.out.print(s.charAt(i));
        }
    }
}