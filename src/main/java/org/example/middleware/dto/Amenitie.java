package org.example.middleware.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Amenitie {
    private String name;
    private Long id;
    private Geom geom;
    private Map<String, String> tags;
    private String type;
}
