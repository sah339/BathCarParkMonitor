package com.sah339.bathcarparkmonitor.repository.model;

public record CarParkDto(
        String name,
        String description,
        int capacity,
        String status,
        int occupancy,
        int percentage,
        int easting,
        int northing,
        String lastupdate,
        String dateuploaded,
        String id,
        LocationDto location) {
}
