package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new VanillaCoffee(
                new WhipCoffee(
                        new MilkCoffee(
                                new SimpleCoffee()
                        )
                )
        );
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
