package Sensors;

public class FireSensor implements BatterySensor {

  private Double batteryPercentage = 100.0;
  private String location = "Location Not Set Yet";
  private final String sensorType = "Fire";
  private final String sensorCategory = "Battery";

  @Override
  public boolean isTriggered() {

    batteryPercentage = batteryPercentage * 0.9;
    double random = Math.random();
    return (random < 0.05);
  }

  @Override
  public String getLocation() {
    return location;
  }

  @Override
  public String getSensorType() {
    return sensorType;
  }

  public double getBatteryPercentage() {
    return batteryPercentage;
  }

  @Override
  public String getSensorCategory() {return sensorCategory;}
}
