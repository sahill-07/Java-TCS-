// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Q10 {
    
    public static int cc(Course [] arr , double ip1 , String ip2){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].mode.equalsIgnoreCase(ip2) && arr[i].cr >= ip1 && arr[i].hc == true){
                count++;
            }
        }
        
        return (count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course [] arr = new Course[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean(); sc.nextLine();
            arr[i] = new Course(a , b  , c , d ,e);
        }
        
        double ip1 = sc.nextDouble(); sc.nextLine();
        String ip2 = sc.nextLine();
        int ans = cc(arr , ip1 , ip2);
        if(ans != 0){
            System.out.println(ans);
        }
        else{
            System.out.println("No course found");
        }
    }
}

class Course{
    int cid ;
    String cname; 
    double cr ;
    String mode ;
    boolean hc ;
    public Course(int cid , String cname , double cr , String mode , boolean hc ){
        this.cid = cid ;
        this.cname = cname ;
        this.cr = cr ;
        this.mode = mode ;
        this.hc = hc ;
    }
}