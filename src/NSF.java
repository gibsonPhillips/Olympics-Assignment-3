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
    public void setPlayers(){
        this.name = name;
    }

}
