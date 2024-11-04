// Count Spaces and number of characters 

import java.util.*;

public class countSpaces {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sCount = 0 , cCount = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                sCount++;
            }
            else if(Character.isAlphabetic(s.charAt(i))){
                cCount++;
            }
        }

        System.out.println("Space Count : " + sCount + " Character Count : " + cCount);
    }
}
