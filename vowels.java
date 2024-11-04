import java.util.*;

public class vowels {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []  words = s.split(" ");
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].charAt(0) == 'a' || words[i].charAt(0) == 'A' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'E' || words[i].charAt(0) == 'i' || words[i].charAt(0) == 'I' || words[i].charAt(0) == 'o' || words[i].charAt(0) == 'O' || words[i].charAt(0) == 'u' || words[i].charAt(0) == 'U'){
                System.out.print(words[i].charAt(0));
            }
        }
    }
}
