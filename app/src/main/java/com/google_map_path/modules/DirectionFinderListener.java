package com.google_map_path.modules;

import java.util.List;

/**
 * Created by Ramesh on 1/19/17.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();

    void onDirectionFinderSuccess(List<Route> route);
}
