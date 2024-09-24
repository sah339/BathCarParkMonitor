package com.sah339.bathcarparkmonitor.repository.model;

import java.util.List;

public record CarParksDto(
        List<CarParkDto> data,
        MetaDto meta
) {
}
