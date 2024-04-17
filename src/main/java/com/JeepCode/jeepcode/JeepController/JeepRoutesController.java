package com.JeepCode.jeepcode.JeepController;
import com.JeepCode.jeepcode.model.JeepRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.JeepCode.jeepcode.JeepService.JeepService;

import java.util.List;

@RestController
@RequestMapping("/jeep/routes")
public class JeepRoutesController {

    @Autowired
    private JeepService jeepService;

    @GetMapping("/{code}")
    public ResponseEntity<JeepRoutes> getRouteByCode(@PathVariable String code) {
        return jeepService.findRouteByCode(code)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<JeepRoutes> getAllRoutes() {
        return jeepService.findAllRoutes();
    }
}