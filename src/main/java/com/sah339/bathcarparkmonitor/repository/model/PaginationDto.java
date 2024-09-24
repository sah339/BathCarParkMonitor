package com.sah339.bathcarparkmonitor.repository.model;

public record PaginationDto(
        int total,
        int count,
        int per_page,
        int current_page,
        int total_pages,
        Object links
) {
}
