package us.hiai.data;

import org.jsoar.util.events.SoarEvent;

import java.util.Arrays;

/**
 * Created by icislab on 10/13/2016.
 */
public class FlightData implements SoarEvent
{
    public int airspeed = 0;
    public int altitude = 0;
    public double lat = 0;
    public double lon = 0;
    public boolean allEningesOK = true;
    public boolean wheelBrakesON;
    public boolean airBrakesON;
    public boolean reversersON;
    public double[] oilPressurePerEngine;
    public double oilPressureGreenLo;
    public double currentTime;

    public FlightData(int airspeed, int altitude, double lat, double lon, boolean allEnginesOK, boolean wBrakes, boolean aBrakes, boolean reversers, float[] oilPressurePerEngine, double oilPressureGreenLo, double currentTime)
    {
        this.airspeed = airspeed;
        this.altitude = altitude;
        this.lat = lat;
        this.lon = lon;
        this.allEningesOK = allEnginesOK;
        this.wheelBrakesON = wBrakes;
        this.airBrakesON = aBrakes;
        this.reversersON = reversers;
        this.oilPressurePerEngine = new double[oilPressurePerEngine.length];
        for (int i = 0; i < oilPressurePerEngine.length; i++) {
            this.oilPressurePerEngine[i] = (double) oilPressurePerEngine[i];
        }
        this.oilPressureGreenLo = oilPressureGreenLo;
        this.currentTime = currentTime;
    }

}
