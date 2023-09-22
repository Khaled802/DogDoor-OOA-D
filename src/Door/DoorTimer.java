package Door;

import java.util.Timer;
import java.util.TimerTask;

public class DoorTimer {
    private final DogDoor door;
    private Timer timer = null;
    private boolean isCanceled;

    public DoorTimer(DogDoor door) {
        this.door = door;
        this.isCanceled = true;
    }

    public void start() {
        this.timer = new Timer();
        this.timer.schedule(new TimerTask() {
            @Override
            public void run() {
                door.close();
            }
        }, 5000);
        this.isCanceled = false;
    }

    public void stop() {
        if (timer != null)
            this.timer.cancel();
        this.timer = null;
    }

}
