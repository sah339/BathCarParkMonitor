package com.sah339.bathcarparkmonitor.repository.model;

public record LocationDto(
        int latitude,
        int longitude,
        GeojsonDto geojson
) {
}
