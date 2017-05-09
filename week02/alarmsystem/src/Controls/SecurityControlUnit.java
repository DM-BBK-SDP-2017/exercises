package Controls;

import Sensors.Sensor;

import java.util.Calendar;
import java.util.List;

/**
 * Created by dannymadell on 21/01/2017.
 */
public class SecurityControlUnit extends ControlUnit {


   public SecurityControlUnit(List<Sensor> list) {
        super(list);
    }

    @Override
    public void pollSensors() throws Exception {
        int time = Calendar.getInstance().HOUR_OF_DAY;
        if (time > 6 || time > 22) {
            super.pollSensors();
        }
    }
}
