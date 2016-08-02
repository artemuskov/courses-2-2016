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
        //Car[] cars = new Car[getCarsNumber(serializedParking)];
        Car[] cars = new Car[getCarsNumber(serializedParking)];
        System.out.println(getCarsNumber(serializedParking));
        int[] quantityCars = new int[getCarsNumber(serializedParking)];


        serializedParking = serializedParking.replaceAll("\\{","");
        serializedParking = serializedParking.replaceAll("\\}","");
        serializedParking = serializedParking.replaceAll("\\[","");
        serializedParking = serializedParking.replaceAll("\\]","");
        serializedParking = serializedParking.replaceAll(":","");
        serializedParking = serializedParking.replaceAll(",","");
        String[] parkingString = serializedParking.split("\"");

        System.out.println("Исходные данные");
        System.out.println(Arrays.toString(parkingString));

        System.out.println("Найденная парковка");
        //Находим парковку и начало печати машин
        int j = 0;
        while (j < getCarsNumber(serializedParking)){
        for (int i = 0; i < parkingString.length; i++) {
            if (parkingString[i].equals("address")) {
                carParking.setAddress(parkingString[i + 2]);
            }
            if (parkingString[i].equals("parkingName")) {
                carParking.setParkingName(parkingString[i + 2]);
            }
            if (parkingString[i].equals("manufacturer")) {
                quantityCars[j] = i;
                j++;
            }
        }
        }
        System.out.println(carParking.toString());

        // Находим машины
        System.out.println("length= " + getCarsNumber(serializedParking));
        for (int n = 0; n < getCarsNumber(serializedParking); n++) {
            for (int i = quantityCars[n]; i < quantityCars[n + 1]-1; i++) {
                    System.out.println("i= " + i);
                    System.out.println("n= " + n);
                    System.out.println("q[n]=" + quantityCars[n]);
                    System.out.println("q[n+1]=" + quantityCars[n+1]);
                    System.out.println(parkingString[i]);
                    System.out.println(parkingString[i + 2]);
                if (parkingString[i].equals("manufacturer")) {
                    cars[n].setManufacturer(parkingString[i + 2]);
                    System.out.println("hello " + parkingString[i + 2]);
                }
                    if (parkingString[i] == ("manufacturer")) {
                        //cars[n].setManufacturer(parkingString[i + 2]);
                        System.out.println(parkingString[i + 2]);
                    }
                    if (parkingString[i].equals("modelName")) {
                        cars[n].setModelName(parkingString[i + 2]);
                    }
                    if (parkingString[i].equals("vin")) {
                        cars[n].setVin(parkingString[i + 2]);
                    }
                    if (parkingString[i].equals(("lengthMillimeters"))) {
                        cars[n].setLengthMillimeters(Integer.parseInt(parkingString[i + 1].trim()));
                    }
                    if (parkingString[i].equals("heightMillimeters")) {
                        cars[n].setHeightMillimeters(Integer.parseInt(parkingString[i + 1].trim()));
                    }
                }
        }
        System.out.println(cars.toString());




       // car.setManufacturer("Mazda");
        //String test = cars[0].getManufacturer();
     //  System.out.println(car.getManufacturer());
       // String[] cars = new String[5];
      //  for (int i = 0; i < getCarsNumber(serializedParking); i++){

     //   }




      //  System.out.println(carParking.toString());
      //  System.out.println("car.lenght = " + cars.length);

      /*  for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < parkingString.length; j++) {
                if (parkingString[j].equals("manufacturer")) {
                    cars[i].setManufacturer(parkingString[j + 2]);
                    System.out.println(i + j);
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
*/
     //   System.out.println(cars.toString());

      //  carParking.setCars(cars);

        //System.out.println("Машины" + Arrays.toString(cars));
      //  System.out.println(serializedParking);
       // System.out.println("Текущая парковка - " + carParking.toString());
       // System.out.print("Ожидаемая парковка - " + serializedParking);
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
