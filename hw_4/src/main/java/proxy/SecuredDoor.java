package proxy;

public class SecuredDoor {
    protected Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    public String open(String pass) {
        if (authenticate(pass)) {
            return door.open();
        } else {
            return "Big no! It ain't possible.";
        }
    }

    private boolean authenticate(String pass) {
        return pass.equals("123");
    }

    public String close() {
        return door.close();
    }
}
