package com.sah339.bathcarparkmonitor.repository;

import jakarta.persistence.*;

@Entity
@Table(name = "car_parks")
public class CarPark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Integer capacity;
    private String status;
    private Integer occupancy;
    private String lastupdate;
    private Double latitude;

    public String name() {
        return name;
    }

    public CarPark setName(String name) {
        this.name = name;
        return this;
    }

    public String description() {
        return description;
    }

    public CarPark setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer capacity() {
        return capacity;
    }

    public CarPark setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public String status() {
        return status;
    }

    public CarPark setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer occupancy() {
        return occupancy;
    }

    public CarPark setOccupancy(Integer occupancy) {
        this.occupancy = occupancy;
        return this;
    }

    public String lastupdate() {
        return lastupdate;
    }

    public CarPark setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
        return this;
    }

    public Double latitude() {
        return latitude;
    }

    public CarPark setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double longitude() {
        return longitude;
    }

    public CarPark setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    private Double longitude;

    public Long getId() {
        return id;
    }
}
