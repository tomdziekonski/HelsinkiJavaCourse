/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dziekonskit
 */
public class Room {

    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;

    }
    
    public void Print () {
        System.out.println("Code of this class is " + this.code + " and the number of seats is: " + this.seats);
    }

}
