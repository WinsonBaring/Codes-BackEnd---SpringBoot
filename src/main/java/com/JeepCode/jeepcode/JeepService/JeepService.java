package com.JeepCode.jeepcode.JeepService;
import com.JeepCode.jeepcode.model.JeepRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JeepCode.jeepcode.JeepRepository.JeepRoutesRepo;

import java.util.List;
import java.util.Optional;

@Service
public class JeepService {
    @Autowired
    private JeepRoutesRepo JeepRoutesRepo;

    public Optional<JeepRoutes> findRouteByCode(String code) {
        return JeepRoutesRepo.findById(code);
    }

    public List<JeepRoutes> findAllRoutes() {
        return JeepRoutesRepo.findAll();
    }
}
