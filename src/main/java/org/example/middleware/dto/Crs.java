package org.example.middleware.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Crs {
    private String type;
    private Map<String, String> properties;
}
