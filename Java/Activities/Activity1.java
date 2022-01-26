
//my code
package com.company;

 public class Activity1 {
    public static void main(String[] args) {
        Car Toyota = new Car();
        //Object Name
        Toyota.make = 2014;
        Toyota.colour = "Block";
        Toyota.transmission = "Manual";


        // Using Car Class method
        Toyota.displayCharacteristics();
      // Toyota.accelerate();
        //Toyota.brake();

    }
}

 class Car {
    //Class
    String colour;
    String transmission;
    public int make;
    public int tyres;
    public int doors;
    //Constructor
    public Car() {
        tyres = 4;
        doors = 4;
    }

//Class Method

    public void displayCharacteristics() {
        System.out.println("Colour of the Car: " + colour);
        System.out.println("Make of the Car: " + transmission);
        System.out.println("Transmission of the Car: " + make);
        System.out.println("Number of doors on the car: " + tyres);
        System.out.println("Number of tyres on the car: " + doors);
    }

}



