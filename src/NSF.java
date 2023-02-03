import java.util.ArrayList;

public class NSF {
    protected String name;
    protected ArrayList<Player> Players=new ArrayList<Player>();

    public NSF(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Player> getPlayers(){
        return Players;
    }
    public void setPlayers(ArrayList<Player> Players){
        this.Players = Players;
    }
    public void listNSFPlayers(){
        for(int i=0;i<Players.size();i++) {
            System.out.print(Players.get(i)+" ");
        }
        System.out.println("");
    }

}
