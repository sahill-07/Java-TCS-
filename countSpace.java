import java.util.*;

public class countSpace {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }

        if(count >= 3){
            System.out.println(count);
        }
        else{
            System.out.println("NA");
        }
    }
}
