package com.capgemini;

import com.capgemini.People.ERoomOccupiedBy;

import java.util.ArrayList;

public class Room {

    private Enum<ERoomType> roomType;

    private boolean occupied;

    private Price price;

    private BabyBed babybed;

    boolean isClean;

    ArrayList<Booking> roomBookings = new ArrayList<Booking>();

    private int number;

    private Enum<ERoomOccupiedBy> roomOccupiedBy;

    public void checkIfAvailable(){

    }

    public void changeRoom(int number, Enum Eroomtype){

    }

    public void removeRoom(){

    }


}
