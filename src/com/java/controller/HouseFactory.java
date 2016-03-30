package com.java.controller;

import com.java.model.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nathanael on 10.03.2016.
 */
public class HouseFactory {
    public static String[] HOUSES = {"Houseboat","Flat","Familyhouse"};
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

    @Deprecated
    public House getHouse(String houseType) {
        Houses house = houseType.equalsIgnoreCase("Houseboat") ? Houses.HOUSEBOAT : houseType.equalsIgnoreCase("Flat") ? Houses.FLAT : Houses.FAMILYHOUSE;
        return getHouse(house);
    }

    public House getHouse(Houses houseType) {
        if (houseType == Houses.HOUSEBOAT) {
            Houseboat houseboat = new Houseboat();
            houseboat.setLocation(createLocation());
            houseboat.setOwner(createPerson());
            houseboat.setRooms(r.nextInt(5));
            houseboat.setRenters(createRenters());
            return houseboat;

        } else if (houseType == Houses.FLAT) {
            Flat flat = new Flat();
            flat.setRooms(5);
            flat.setOwner(createPerson());
            flat.setLocation(createLocation());
            flat.setRenters(createRenters());
            return flat;

        } else {
            Familyhouse familyhouse = new Familyhouse();
            familyhouse.setRenters(createRenters());
            familyhouse.setLocation(createLocation());
            familyhouse.setOwner(createPerson());
            familyhouse.setRooms(5);
            return familyhouse;
        }
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
        location.setAddress("Teststrasse 20, 1000 Test");
        location.setLatitude(55);
        location.setLongitude(55);
        return location;
    }
}
