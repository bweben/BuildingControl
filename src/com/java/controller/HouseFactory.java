package com.java.controller;

import com.java.model.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nathanael on 10.03.2016.
 */
public class HouseFactory {
    private static HouseFactory houseFactory;
    private Random r;

    private HouseFactory() {
        r = new Random();
    }

    public static HouseFactory getInstance() {
        if (houseFactory == null) {
            houseFactory = new HouseFactory();
        }
        return houseFactory;
    }

    public House getHouse(String houseType) {
        if (houseType.equalsIgnoreCase("Houseboat")) {
            Houseboat houseboat = new Houseboat();
            houseboat.setLocation(createLocation());
            houseboat.setOwner(createPerson());
            houseboat.setRooms(r.nextInt(5));
            houseboat.setRenters(createRenters());
            return houseboat;

        } else if (houseType.equalsIgnoreCase("Flat")) {
            Flat flat = new Flat();
            flat.setRooms(5);
            flat.setOwner(createPerson());
            flat.setLocation(createLocation());
            flat.setRenters(createRenters());

        } else if (houseType.equalsIgnoreCase("Familyhouse")) {

        }

        return null;
    }

    private ArrayList<Person> createRenters() {
        ArrayList<Person> renters = new ArrayList<Person>();
        for (int i = 0; i < 4; i++) {
            renters.add(createPerson());
        }
        return renters;
    }

    private Person createPerson() {
        Person person = new Person();
        person.setName("Standard");
        return person;
    }

    private Location createLocation() {
        Location location = new Location();
        location.setAddress("Standard");
        location.setLatitude(55);
        location.setLongitude(55);
        return location;
    }
}
