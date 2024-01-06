package org.example.middleware.controller;


import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.middleware.dto.Amenitie;
import org.example.middleware.dto.Crs;
import org.example.middleware.dto.Geom;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/amenities")
public class RestAmenities {

    @GetMapping("/")
    @ResponseBody
    Amenitie getAmenitie(@RequestParam(name = "point.x", required = false) Long pointx) {
        return Amenitie.builder()
                .name("Athen")
                .id(12345L)
                .geom(
                        Geom.builder()
                                .coordinates(List.of(0.8125, 1.2323))
                                .type("Point")
                                .crs(Crs.builder().type("name").properties(Map.of("name","EPSG:0")).build()).build())
                .tags(Map.of("note","Tür"))
                .type("Restaurant")
                .build();
    }

}
