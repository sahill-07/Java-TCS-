import java.util.*;
public class largestWord {
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] word = s.split(" ");
        int maxi = 0 , ans = 0 ;
        for(int i = 0 ; i < word.length ; i++){
            if(maxi < word[i].length()){
                maxi = word[i].length();
                ans = i ;
            }
        }

        System.out.println(maxi + " " + word[ans]);
    }
}
