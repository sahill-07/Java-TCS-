// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Q9 {
    
    public static int fap(Resort [] arr , String ip){
        int sum = 0 , count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].c.equalsIgnoreCase(ip) && arr[i].rr > 4){
                count++;
                sum += arr[i].rp;
            }
        }
        
        return (sum/count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort [] arr = new Resort[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            double e = sc.nextDouble(); sc.nextLine();
            arr[i] = new Resort(a , b  , c , d ,e);
        }
        
        String ip = sc.nextLine();
        int ans = fap(arr , ip);
        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("No such Resort found");
        }
    }
}

class Resort{
    int rid ;
    String rname ;
    String c ;
    double rp ;
    double rr ;
    
    public Resort(int rid , String rname , String c , double rp , double rr){
        this.rid = rid ;
        this.rname =rname ;
        this.c = c ;
        this.rp = rp;
        this.rr=rr ;
    }
    
}