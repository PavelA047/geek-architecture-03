package proxy;

public class Main {
    public static void main(String[] args) {
        SecuredDoor door = new SecuredDoor(new LabDoor());
        System.out.println(door.open("123"));
        System.out.println(door.open("321"));
        System.out.println(door.close());
    }
}
