package adapter;

public class WildDogAdapter implements Lion {
    protected WildDog wildDog;

    public WildDogAdapter(WildDog wildDog) {
        this.wildDog = wildDog;
    }

    @Override
    public void roar() {
        wildDog.bark();
    }
}
