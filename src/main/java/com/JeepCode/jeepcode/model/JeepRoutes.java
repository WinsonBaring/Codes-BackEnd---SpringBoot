package com.JeepCode.jeepcode.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import java.util.List;

@Entity
public class JeepRoutes {
    @Id
    private String code; 
    
    @ElementCollection
    private List<String> waypoints; 

    public JeepRoutes() {}

    public JeepRoutes(String code, List<String> waypoints) {
        this.code= code;
        this.waypoints = waypoints;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<String> waypoints) {
        this.waypoints = waypoints;
    }

    
}
