package com.google_map_path.modules;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.nearby.messages.Distance;

import java.util.List;

import javax.xml.datatype.Duration;

/**
 * Created by Ramesh on 1/19/17.
 */

public class Route {
    public com.google_map_path.modules.Distance distance;
    public com.google_map_path.modules.Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
