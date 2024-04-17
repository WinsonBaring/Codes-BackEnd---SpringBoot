package com.JeepCode.jeepcode.JeepRepository;

import com.JeepCode.jeepcode.model.Jeep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JeepRepository extends JpaRepository<Jeep, Integer> {
}
