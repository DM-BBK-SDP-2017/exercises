package Alert;

import Sensors.Sensor;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by dannymadell on 22/01/2017.
 */
public class AnnouncementFactory {

    private static AnnouncementFactory announcementFactory;

    static {
        announcementFactory = new AnnouncementFactory();
    }

    private File propsFile;
    private Properties properties;
    private Announcement announcement;
    private HashMap<Object, Object> map;



    public AnnouncementFactory() {
       // System.out.println("HERE");
        properties = new Properties();
        propsFile = new File("alarmsystem/src/bindings.properties");
        try {
            properties.load(new FileInputStream(propsFile));
        } catch (Exception ex) {ex.printStackTrace();}
        map = new HashMap<>();
        properties.forEach((x, y) -> map.put(x, y));
        //map.forEach((x,y) -> System.out.println(x + " " + y));
    }

    public static AnnouncementFactory getInstance() {
        return announcementFactory;
    }

    public Class match(Sensor sensor) throws Exception {
        return Class.forName(properties.getProperty(sensor.getClass().toString()));
    }

    public Announcement getAnnouncement(Sensor sensor) throws Exception {


        return (Announcement) Class.forName(properties.getProperty(sensor.getClass().getCanonicalName())).newInstance();






    }
}
