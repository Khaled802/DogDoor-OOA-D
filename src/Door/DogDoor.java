package Door;

import Door.types.DoorState;

import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class DogDoor {
    private final Vector<Bark> allowedBarks;

    private DoorState state;
    private DoorTimer doorTimer;

    public DogDoor() {
        this.allowedBarks = new Vector<Bark>();
        this.allowedBarks.add(new Bark("HWAW"));
        this.allowedBarks.add(new Bark("WAA"));
        this.allowedBarks.add(new Bark("GHAW"));
        this.doorTimer = new DoorTimer(this);
        state = DoorState.closed;
    }

    public void open() {
        if (this.state.equals(DoorState.opened)) {
            System.out.println("is already opened"); return;
        }

        state = DoorState.opened;
        System.out.println("is opened");
        this.doorTimer.start();
    }

    public void close() {
        if (this.state.equals(DoorState.closed)) {
            System.out.println("is already closed"); return;
        }
        this.doorTimer.stop();

        state = DoorState.closed;
        System.out.println("is closed");
    }

    public Bark[] getAllowedBarks() {
        Bark[] result = new Bark[this.allowedBarks.size()];
        this.allowedBarks.copyInto(result);
        return result;
    }

    public boolean isOpened() {
        return this.state.equals(DoorState.opened);
    }
}
