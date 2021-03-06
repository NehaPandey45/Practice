import java.util.ArrayList;
import java.util.List;

public class UtilGamers {

    private final List<Gamer> gamersList = new ArrayList<>();

    public List<Gamer> getGamersList(){
        return gamersList;
    }

    public boolean changeName(String oldNAme, String newName){
        for(Gamer gamer : gamersList){
            if(gamer.toString().contains(oldNAme)){
                gamer.changeName(newName);
                return true;
            }
        }
        return false;
    }
}