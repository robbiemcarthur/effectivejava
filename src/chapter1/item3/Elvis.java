package chapter1.item3;

public class Elvis {
    /*
    Singleton with a public final field
     */
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public void leaveTheBuilding() {
        System.out.println("Elvis has left the building!");
    }
}