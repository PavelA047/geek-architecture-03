package bridge;

public class Main {
    public static void main(String[] args) {
        About about = new About();
        about.construct(new AquaTheme());
        System.out.println(about.getContent());
    }
}
