package flyweight;

public class Main {
    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();

        System.out.println(teaShop.takeOrder("karak", 3));
        System.out.println(teaShop.takeOrder("karak", 3));
        System.out.println(teaShop.takeOrder("karak", 3));
        System.out.println(teaShop.takeOrder("red", 3));
        System.out.println(teaShop.takeOrder("red", 3));
        System.out.println(teaShop.takeOrder("red", 3));
        System.out.println(teaShop.takeOrder("green", 3));
        System.out.println(teaShop.takeOrder("black", 3));
        System.out.println(teaShop.takeOrder("black", 3));
        System.out.println(teaShop.takeOrder("black", 3));
    }
}
