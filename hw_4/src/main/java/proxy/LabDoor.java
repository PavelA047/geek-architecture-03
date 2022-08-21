package proxy;

public class LabDoor implements Door{
    @Override
    public String open() {
        return "Opening lab door";
    }

    @Override
    public String close() {
        return "Closing the lab door";
    }
}
