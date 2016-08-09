package com.courses.spalah;

import java.util.Random;

/**
 * Класс который представляет ячейку на рулетке
 */
public class Cell {
    private int cellNumber = 0;
    private boolean isRed = false;
    Random random = new Random();

    /*   public void generateCell () {
           this.cellNumber = random.nextInt(37);
           this.isRed = random.nextBoolean();
       }
*/
    public int setCellNumber(int cellNumber){
          this.cellNumber = cellNumber;
           return cellNumber;
    }

    public void setIsRed(boolean isRed){
        this.isRed = isRed;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public boolean getIsRed() {
        return isRed;
    }

    public void print(){
        System.out.print(cellNumber + "(");
        if (cellNumber == 0) {
            System.out.print("Зеленое), ");
        }
        if (isRed == true) {
            System.out.print("Красное), ");
        }
        if (isRed == false) {
            System.out.print("Черное), ");
        }
    }
}
