package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingJSONSerializer implements CarParkingSerializer {

    @Override
    public String serialize(CarParking carParking) {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("   \"address\": \"");
        json.append(carParking.getAddress() + "\",\n");
        json.append("   \"parkingName\": \"");
        json.append(carParking.getParkingName() + "\",\n   \"cars\": [\n");

        for (Car car : carParking.getCars())
            json.append("\"manufacturer\": \"");
            json.append(car.)
        System.out.print(json);
        return json.toString();
    }
}
