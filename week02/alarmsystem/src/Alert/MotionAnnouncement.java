package Alert;

/**
 * Created by dannymadell on 22/01/2017.
 */
public class MotionAnnouncement implements Announcement {

    @Override
    public void trigger() {
        System.out.println("MOTION TRIGGERED");

    }
}
