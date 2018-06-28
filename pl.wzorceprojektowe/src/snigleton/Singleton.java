package snigleton;

public class Singleton {
    private static Singleton instance = null;
    public String name;

    private Singleton(){
        System.out.println("Singleton create");
    }
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
