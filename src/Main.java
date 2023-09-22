import Door.Bark;
import Door.BarkRecognizer;
import Door.DogDoor;
import Door.Remote;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var door = new DogDoor();
        var barkRec = new BarkRecognizer(door);
        var remote = new Remote(door);

        var bark = new Bark("kdsfm");
        barkRec.recognize(bark);

        bark = new Bark("HWAW");
        barkRec.recognize(bark);

        remote.pressButton();

        bark = new Bark("GHAW");
        barkRec.recognize(bark);

    }
}