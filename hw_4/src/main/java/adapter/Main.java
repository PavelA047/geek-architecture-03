package adapter;

public class Main {
    public static void main(String[] args) {
        new Hunter().hunt(new WildDogAdapter(new WildDog()));
    }
}
