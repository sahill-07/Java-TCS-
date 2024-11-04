import java.util.*;

public class Q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Team [] arr = new Team[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt();
            sc.nextLine() ;
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();

            arr[i] = new Team(a , b, c , d, e);
        }

        String i1 = sc.nextLine();
        int i2 = sc.nextInt() ;

        int ans = teamWithHighRuns(arr, i1 , i2);
    }

    public static int teamWithHighRuns(Team [] arr , String loc , int n ){
        int maxi = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].location.equalsIgnoreCase(loc) && arr[i].noOfWicInTeam > n){
                if(arr[i].totalRunsByTeam > maxi){
                    maxi = arr[i].totalRunsByTeam ;
                }
            }
        }
        return maxi ;
    }
}

class Team{
    public int teamId ;
    public String teamName;
    public String location ;
    public int totalRunsByTeam ;
    public int noOfWicInTeam ;

    public Team(int teamId , String teamName , String location , int totalRunsByTeam , int noOfWicInTeam){
        this.teamId = teamId ;
        this.teamName = teamName ;
        this.location = location ;
        this.totalRunsByTeam = totalRunsByTeam ;
        this.noOfWicInTeam = noOfWicInTeam ;
    }
}
