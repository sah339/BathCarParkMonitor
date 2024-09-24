package com.sah339.bathcarparkmonitor.repository.model;

import java.util.List;

public record GeojsonDto(
        String type,
        List<Double> coordinates
) {
}
