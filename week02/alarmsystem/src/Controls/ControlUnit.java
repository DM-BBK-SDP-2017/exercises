package Controls;

import Alert.AnnouncementFactory;
import Sensors.Sensor;

import java.util.List;

public class ControlUnit {

  private List<Sensor> sensors = null;
  //private List<Sensors.Sensor> triggeredSensor = null;


  public ControlUnit() {}
  public ControlUnit(List<Sensor> sensors) {
    this.sensors = sensors;
  }
  //private AnnouncementContext announcementContext = null;


  public void pollSensors() throws Exception {

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        AnnouncementFactory.getInstance().getAnnouncement(sensor).trigger();
        System.out.println("A " + sensor.getSensorType() + " sensor was triggered at " + sensor.getLocation());
      } else {
        System.out.println("Polled " + sensor.getSensorType() + " at " + sensor.getLocation() + " successfully");
      }
    }
  }



    //String sensorType = sensor.getSensorType();

    /*switch (sensor) {
      case Class.forName("FireSensor").newInstance(): AnnouncementContext.doAnnouncement(); break;
      case "Smoke": new AnnouncementContext(new SmokeAnnouncement()).doAnnouncement(); break;
      case "Motion": new AnnouncementContext(new MotionAnnouncement()).doAnnouncement(); break;

    }*/


}
