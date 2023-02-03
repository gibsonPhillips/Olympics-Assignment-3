import java.util.ArrayList;

public class ROC {
    private String name;
    private ArrayList<NOC> NOCs=new ArrayList<NOC>();

    ROC(String name, ArrayList<NOC> NOCs) {
        this.name = name;
        this.NOCs = NOCs;
    }
     String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     ArrayList<NOC> getNOCs() {
        return NOCs;
    }

     void setListNOC(ArrayList<NOC> listNOC) {
        this.NOCs = NOCs;
    }
     int countNSFs(){
        return NOCs.size();
    }

     int countPlayersInNOCNSFs(){
        int players=0;
        for(int i=0;i<NOCs.size();i++) {
            players+=NOCs.get(i).countPlayersInNSFs();
        }
        return players;

    }

}
