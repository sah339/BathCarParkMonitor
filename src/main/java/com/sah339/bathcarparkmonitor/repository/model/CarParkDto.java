package com.sah339.bathcarparkmonitor.repository.model;

public record CarParkDto(
        String name,
        String description,
        Integer capacity,
        String status,
        Integer occupancy,
        Integer percentage,
        Integer easting,
        Integer northing,
        String lastupdate,
        String dateuploaded,
        String id,
        LocationDto location) {
}
