package Door;

public class BarkRecognizer {
    private final DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        if (bark.equalsAny(this.door.getAllowedBarks())) {
            this.door.open();
            return;
        }
        System.out.println("not allowed sound");
    }
}
