package org.example.middleware.controller;

import java.awt.print.Pageable;
import java.util.List;

public interface RestRoad {
    String getRoad(Long id);

    List<String> getPagedRoad(Long[] id);
}
