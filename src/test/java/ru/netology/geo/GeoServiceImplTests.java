package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeoServiceImplTests {

    @Test
    public void getLocationByMoscowIpTest() {
        GeoService geoService = new GeoServiceImpl();
        String expected = "Moscow";
        String result = geoService.byIp("172.0.32.11").getCity();
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void getLocationByNYIpTest() {
        GeoService geoService = new GeoServiceImpl();
        String expected = "New York";
        String result = geoService.byIp("96.44.183.149").getCity();
        Assertions.assertEquals(result, expected);
    }
}
