package com.company;

public class Main {
/*
 * @Author Yovanny Arley Valderrama Figueroa - Valderrama1858@gmail.com
 */
    public static void main(String[] args) {
    int result = addNumbers(58, 258, 356);
    System.out.println("=======================\nla suma de los 3 numeros es: " +
            result + "\n=======================");


    Car myCar  = new Car();
    myCar.addDoors();
    System.out.println("el coche tiene " + myCar.numberDoors + " puertas se le agrego 1 puerta.");
/*
 * la funcion "addNumbers" nos permite sumar
 * los numeros definidos en la bariable "int resultado"
 * y nos retorna la suma de los 3 numeros.
 */
    }
    static int addNumbers(int number1,int number2,int number3){
        return number1 + number2 + number3;
    }

/*
 * esta clase "Car" nos ayudara a crear un cohe "myCar"
 * y nos permitira agregar mas puertas al mismo.
 */
    static class Car{
        public int numberDoors = 4;
        public void addDoors() {
            numberDoors++;
        }
    }

}
