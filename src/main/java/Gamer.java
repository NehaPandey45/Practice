

public class Gamer {

    private String name;
    private int points;

    public Gamer(String name){
        this.name = name;
        points = 0;
    }
    protected void changeName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name + " with " + points + " points";
    }
}