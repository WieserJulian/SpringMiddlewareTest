package org.example.middleware.controller;

import org.springframework.web.bind.annotation.*;

import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.util.List;

@RestController
@RequestMapping("/road/")

public class RestRoadImpl implements RestRoad {

    @GetMapping("")
    @Override
    public String getRoad(Long id) {
        return null;
    }

    @PostMapping("/page")
    @ResponseBody
    @Override
    public List<String> getPagedRoad(Long[] id) {
        return null;
    }
}
