import java.util.*;

class Rrt{
    int tno ;
    String rb ;
    String at;
    int p ;
    String pro ;

    public Rrt(int tno , String rb , String at ,  int p , String pro){
        this.tno = tno;
        this.rb = rb ; 
        this.at = at;
        this.p = p;
        this.pro = pro ;
    }
}


public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rrt [] arr = new Rrt[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt() ; sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Rrt(a , b , c , d, e);
        }

        String ip = sc.nextLine();
        Rrt ans = getHighestPriorityTicket(arr , ip);
        if(ans != null){
            System.out.println(ans.tno);
            System.out.println(ans.rb);
            System.out.print(ans.at);
        }
        else{
            System.out.println("No such ticket.");
        }
    }

    public static Rrt getHighestPriorityTicket(Rrt[] arr , String ip ) {
        int mini = Integer.MAX_VALUE ;
        Rrt temp = null ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].pro.equals(ip)){
                if(mini > arr[i].p){
                    mini = arr[i].p ;
                    temp = arr[i];
                }
            }
        }

        return temp ;
    }
}

