package Announcement;

/**
 * Created by dannymadell on 22/01/2017.
 */
public class FireAnnouncement implements Announcement {

    @Override
    public void trigger() {
        System.out.println("FIRE TRIGGERED");
    }
}
