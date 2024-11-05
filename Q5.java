import java.util.* ;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employe [] arr = new Employe[4];
        for(int i = 0 ; i < 4  ; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new Employe(a, b, c, d, e);
        }
        String ip1 = sc.nextLine();

        int ans1 = findCountOfEmployeesUsingCompTransport(arr, ip1);
        if(ans1 != 0){
            System.out.println(ans1);
        }
        else{
            System.out.println("no such emp");
        }

        Employe ans2 = findEmployeeWithSecondHighestRating(arr);
        if(ans2 != null){
            System.out.println(ans2.eid);
            System.out.println(ans2.name);
        }
        else{
            System.out.println("All emp using company tranport");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employe [] arr , String ip) {
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].branch.equalsIgnoreCase(ip) && arr[i].t ){
                count++;
            }
        }

        if(count > 0){
            return count ;
        }
        
        return count ;
    }

    public static Employe findEmployeeWithSecondHighestRating(Employe [] arr) {
        List<Employe>a = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].t == false){
                a.add(arr[i]);
            }
        }

        a.sort(Comparator.comparingDouble(e -> e.rating).reversed());
        if(a.size() == 0 || a.size() == 1){
            return null;
        }
        return a.get(1) ;
    }
}

class Employe {
    int eid ;
    String name ;
    String branch ;
    double rating ;
    boolean t ;

    public Employe(int eid ,String name , String branch , double rating , boolean t){
        this.eid = eid ;
        this.name = name ;
        this.branch = branch ;
        this.rating = rating ;
        this.t = t ; 
    }
}
