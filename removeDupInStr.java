// Removing duplicate characters in a string 

import java.util.*;
public class removeDupInStr {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for(int i = 0 ; i < s.length() ; i++){
            if(ans.indexOf(s.charAt(i)) == -1){
                ans = ans + s.charAt(i);
            }
        }

        System.out.println(ans);
    }
}
