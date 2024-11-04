import java.util.*;
public class Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Player [] p = new Player[4];

        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            p[i] = new Player(a , b , c, d, e);
        }
        String t1 = sc.nextLine();
        String t2 = sc.nextLine();
        int ans1 = findPlayersWithLowestRuns(p , t1);
        Player [] ans2 =  findPlayerByMatchType(p , t2);
        if(ans1 != 0){
            System.out.println(ans1);
        }
        if(ans2 != null){
            for(int i = 0 ; i < 2 ; i++){
                System.out.println(ans2[i]);
            }
        }else{
            System.out.println("No Player with given matchType");
        }
    }

    public static int findPlayersWithLowestRuns(Player [] p , String t1){
        int mini = 0 ;
        Boolean found = false;
        for(int i = 0 ; i < p.length ; i++){
            if(p[i].getPlayerType().equalsIgnoreCase(t1)){
                if(p[i].getRuns() < mini){
                    mini = p[i].getRuns();
                    found = true;
                }
            }
        }
        if(found){
            return mini;
        }
        return 0;
    }

    public static Player[] findPlayerByMatchType(Player [] p , String t2){
        Player [] arr = new Player[2];
        for(int i = 0 ; i < p.length ; i++){
            if(p[i].getMatchType().equalsIgnoreCase(t2)){
                arr[0] = p[i];
            }
        }

        if(arr.length == 0){
            return null ;
        }
        return arr;
    }
}


class Player{
    int playerId;
    String playerName;
    int runs;
    String playerType;
    String matchType;
    
    public Player(int playerId , String playerName , int runs , String playerType , String matchType){
        this.playerId = playerId;
        this.playerName = playerName ;
        this.runs = runs ;
        this.playerType = playerType;
        this.matchType = matchType;
    }
    public int getPlayerId(){
        return playerId;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getRuns(){
        return runs;
    }
    public String getPlayerType(){
        return playerType;
    }
    public String getMatchType(){
        return matchType;
    }
};