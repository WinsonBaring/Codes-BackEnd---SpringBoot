package com.JeepCode.jeepcode.JeepController;

import com.JeepCode.jeepcode.JeepService.JeepService;
import com.JeepCode.jeepcode.model.Jeep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jeep")
public class JeepController {
    @Autowired
    private JeepService jeepService;

    @PostMapping("/add")
    public String addJeep(@RequestBody Jeep jeep) {
        jeepService.saveJeep(jeep);
        return"New Jeep is added";
    }
}
