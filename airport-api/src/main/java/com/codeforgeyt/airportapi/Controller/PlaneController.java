package com.codeforgeyt.airportapi.Controller;

import com.codeforgeyt.airportapi.Service.PlaneService;
import com.codeforgeyt.airportcore.Model.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping(value = "planes")
    public ResponseEntity<PlaneDto> getPlane() {
        PlaneDto planeDto = planeService.getPlane();
        return new ResponseEntity<>(planeDto, HttpStatus.OK);

    }
}
