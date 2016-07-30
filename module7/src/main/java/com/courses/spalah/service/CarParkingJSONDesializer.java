package com.courses.spalah.service;

import com.courses.spalah.model.Car;
import com.courses.spalah.model.CarParking;

/**
 * Created by Artem Uskov on 28.07.2016.
 */
public class CarParkingJSONDesializer implements CarParkingDeserializer {

    @Override
    public CarParking deserialize(String serializedParking){
        CarParking carParking = new CarParking();






 /*       serializedParking = serializedParking.replaceAll("\\p{Cntrl}","");
      //  serializedParking = serializedParking.replaceAll(" ","");
        int adressIndex = serializedParking.indexOf("adress") + 16;
        carParking.setAddress(serializedParking.substring(adressIndex, serializedParking.indexOf("\"", adressIndex++)));
        int nameIndex = serializedParking.indexOf("parkingName") + 15;
        carParking.setParkingName(serializedParking.substring(nameIndex, serializedParking.indexOf("\"", nameIndex++)));
      //  int carsCount = getCarsNumber(serializedParking);
        for (int i = 0; i < getCarsNumber(serializedParking); i++){
            int manufacturerIndex = serializedParking.indexOf("manufacturer");
          //  carParking.setCars(Car[i], cars);
            System.out.println("машина");
        }

    */






        System.out.println("Текущая парковка - " + carParking.toString());
        System.out.print("Ожидаемая парковка - " + serializedParking);
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
