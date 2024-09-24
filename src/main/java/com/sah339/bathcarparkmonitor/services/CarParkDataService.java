package com.sah339.bathcarparkmonitor.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sah339.bathcarparkmonitor.repository.model.CarParkDto;
import com.sah339.bathcarparkmonitor.repository.model.CarParksDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class CarParkDataService {
    private static final String URI = "https://data.bathhacked.org/api/datasets/8/rows?page=1&per_page=15";
    private static final RestTemplate restTemplate = new RestTemplate();

    public static CarParksDto getCarParkData() throws IOException {
        String result = restTemplate.getForObject(URI, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        CarParksDto data = objectMapper.readValue(result, CarParksDto.class);
        return data;
    }
}
