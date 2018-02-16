package com.capgemini.Person;

import com.capgemini.ERoomType;
import com.capgemini.Room;

import java.util.ArrayList;

public class Employee extends Person {

    private int idNumber;

    private ArrayList<Room> rooms = new ArrayList<Room>();


    public void initializeRooms(){

        Room room = new Room(ERoomType.STANDARD, 1);
        this.rooms.add(room);

    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
