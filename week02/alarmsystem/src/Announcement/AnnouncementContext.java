package Announcement;

import Sensors.Sensor;

import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by dannymadell on 22/01/2017.
 */
public class AnnouncementContext {

    private Announcement announcement = null;


    public static String getProperties(String str) throws Exception {
        File propsFile = new File("/Users/dannymadell/Documents/code/SDP-2017/exercises/week02/alarmsystem/src/bindings.properties");
        Properties properties = new Properties();
        properties.load(new FileInputStream(propsFile));
        Enumeration<?> enums = properties.propertyNames();

       do {
           System.out.println(enums.nextElement());

       } while (enums.nextElement() != null);

        System.out.println(str);
        System.out.println(properties.get(str));

        return properties.getProperty(str);

    }

    public AnnouncementContext(Announcement announcement) {this.announcement = announcement; }



    public static void doAnnouncement(Sensor sensor) throws Exception {
        System.out.println(sensor.getClass());
        System.out.println(getProperties(sensor.getClass().toString()));
        Announcement announcement = (Announcement) Class.forName(getProperties(sensor.getClass().toString())).newInstance();
        announcement.trigger();


    }
}
