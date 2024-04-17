package com.JeepCode.jeepcode.JeepService;

import com.JeepCode.jeepcode.JeepRepository.JeepRepository;
import com.JeepCode.jeepcode.model.Jeep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JeepServiceImplement implements JeepService {
    /**
     * @param jeep
     * @return
     */
    @Autowired
    private JeepRepository jeepRepository;

    @Override
    public Jeep saveJeep(Jeep jeep) {
        return jeepRepository.save(jeep);
    }
}
