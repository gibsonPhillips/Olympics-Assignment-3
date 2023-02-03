import java.util.ArrayList;

public class Player {
     private String name;
    private ArrayList<NSF> NSFs=new ArrayList<NSF>();
    public Player(String name){
        this.name=name;
        this.NSFs=null;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public ArrayList<NSF> getNSFs(){
        return NSFs;
    }
    public void setNSFs(ArrayList<NSF> NSFs){
        this.NSFs=NSFs;
    }
    public void listPlayerNSFs(){

        for(int i=0;i<NSFs.size();i++) {
             System.out.print(NSFs.get(i)+" ");
        }
        System.out.println("");
    }
    public void addNSF(NSF NSF){
        NSFs.add(NSF);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
