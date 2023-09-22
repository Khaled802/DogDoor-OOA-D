package Door;

public class Remote {
    private final DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        if (this.door.isOpened())
            this.door.close();
        else
            this.door.open();
    }

}
