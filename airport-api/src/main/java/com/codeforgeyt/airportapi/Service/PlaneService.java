package com.codeforgeyt.airportapi.Service;

import com.codeforgeyt.airportcore.Model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    public PlaneDto getPlane() {
        return new PlaneDto("Jet PLane", 4);
    }
}
