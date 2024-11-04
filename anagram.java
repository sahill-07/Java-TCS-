import java.util.*;

public class anagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagram(s1 , s2)){
            System.out.println("anagram");
        }else{
        System.out.println("not anagram");
        } 
        
    }

    public static boolean isAnagram(String s1 , String s2){
        // s1 = s1.replaceAll("\\s", "").toLowerCase();
        // s2 = s2.replaceAll("\\s", "").toLowerCase();
        if(s1.length() != s2.length()){
            return false ;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0 ; i < c1.length ; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }

        return true;
    }
}
