package org.example.middleware.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Geom {
    private String type;
    private List<Double> coordinates;
    private Crs crs;
}
