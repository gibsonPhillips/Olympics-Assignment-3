import java.util.ArrayList;

public class NOC {
    String name;
    ArrayList<NSF> NOCs = new ArrayList<NSF>();

     NOC(String name, ArrayList<NSF> NOCs) {
        this.name = name;
        this.NOCs = NOCs;
    }

     String getName() {
        return name;
    }
     void setName(String name) {
        this.name = name;
    }
     ArrayList<NSF> getNOCs() {
        return NOCs;
    }
     void setNOCs(ArrayList<NSF> NOCs) {
        this.NOCs = NOCs;
    }

    @Override
    public String toString() {
        return "NOC{" +
                "name='" + name + '\'' +
                '}';
    }

    int countPlayersInNSFs() {
        int players = 0;
        for (int i = 0; i < NOCs.size(); i++) {
            players += NOCs.get(i).getPlayers().size();
        }
        return players;
    }

}
