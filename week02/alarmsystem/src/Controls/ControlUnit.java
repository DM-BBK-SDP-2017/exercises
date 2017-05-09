package Controls;

import Alert.AnnouncementFactory;
import Sensors.Sensor;

import java.util.List;

public class ControlUnit {

  private List<Sensor> sensors = null;

  public ControlUnit(List<Sensor> sensors) {
    this.sensors = sensors;
  }


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




}
