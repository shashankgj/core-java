public class Sports 
{
    private String name;
    private String type;
    private int players;

    public static int popularity;

    static {
        System.out.println("static block in Sports");
        popularity = 100;
    }

    {
        System.out.println("non static block in Sports");
        popularity = 80;
    }

    public void setname(String sportName) {
        name = sportName;
    }

    public void settype(String sportType) {
        type = sportType;
    }

    public void setplayers(int sportPlayers) {
        players = sportPlayers;
    }

    public String getname() {
        return name;
    }

    public String gettype() {
        return type;
    }

    public int getplayers() {
        return players;
    }
}
