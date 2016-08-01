package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingJSONDesializer implements CarParkingDeserializer {

    @Override
    public CarParking deserialize(String serializedParking){
        CarParking carParking = new CarParking();
        Car[] cars = new Car[getCarsNumber(serializedParking)];

        serializedParking = serializedParking.replaceAll("\\{","");
        serializedParking = serializedParking.replaceAll("\\}","");
        serializedParking = serializedParking.replaceAll("\\[","");
        serializedParking = serializedParking.replaceAll("\\]","");
        serializedParking = serializedParking.replaceAll(":","");
        serializedParking = serializedParking.replaceAll(",","");
        String[] parkingString = serializedParking.split("\"");


        for (int i = 0; i < parkingString.length; i++){
            if (parkingString[i].equals("address")) {
                carParking.setAddress(parkingString[i + 2]);
            }
            if (parkingString[i].equals("parkingName")) {
                carParking.setParkingName(parkingString[i + 2]);
            }
        }

        for (int j = 0; j < parkingString.length; j++) {
            for (int i = 0; i < cars.length; i++) {
                if (parkingString[j].equals("manufacturer")) {
                    cars[i].setManufacturer(parkingString[j + 2]);
                }
                if (parkingString[j].equals("modelName")) {
                    cars[i].setModelName(parkingString[j + 2]);
                }
                if (parkingString[j].equals("vin")) {
                    cars[i].setVin(parkingString[j + 2]);
                }
                if (parkingString[j].equals(("lengthMillimeters"))) {
                    cars[i].setLengthMillimeters(Integer.parseInt(parkingString[j + 1].trim()));
                }
                if (parkingString[j].equals("heightMillimeters")) {
                    cars[i].setHeightMillimeters(Integer.parseInt(parkingString[j + 1].trim()));
                }
            }
        }

        carParking.setCars(cars);

        //System.out.println("Машины" + Arrays.toString(cars));
        //System.out.println("Текущая парковка - " + carParking.toString());
        //System.out.print("Ожидаемая парковка - " + serializedParking);
        return carParking;
    }

    public static int getCarsNumber(String serializedParking) {
        String serializedJSON = serializedParking;
        String word = "manufacturer";
        int i = serializedJSON.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = serializedJSON.indexOf(word, i + 1);
        }
        return count;
    }
}
