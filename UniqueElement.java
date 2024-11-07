// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class UniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character>st = new HashSet<>();
        String ans = "" ;
        for(int i = 0 ; i < s.length() ; i++){
           
               st.add(s.charAt(i));
        }
        List<Character>arr = new ArrayList<>(st);
        Collections.sort(arr);
       for(int i = 0 ; i < arr.size() ; i++){
           ans = ans + arr.get(i);
       }
       
       System.out.println(ans);
        
    }
}