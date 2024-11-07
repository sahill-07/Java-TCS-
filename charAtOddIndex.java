// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class charAtOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        for(int i = 0 ; i < s.length() ; i++){
            if(i % 2 != 0){
                System.out.print(s.charAt(i));
            }
        }
    }
}