package com.java.testing;

import com.java.controller.HouseFactory;
import com.java.model.Building;
import com.java.model.House;
import com.java.model.Houses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nathanael on 09.06.2016.
 */
public class DB_HouseStub {
    public List<House> readAll() {
        return Arrays.asList(HouseFactory.getInstance().getHouse(Houses.FAMILYHOUSE),HouseFactory.getInstance().getHouse(Houses.HOUSEBOAT),HouseFactory.getInstance().getHouse(Houses.FAMILYHOUSE));
    }

    public boolean delete(House house) {
        house = null;
        return true;
    }
}
