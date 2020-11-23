package com.clovisphere.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreLocator implements SourceLocator {
    private static final List<RentalLocation> locations = new ArrayList<>();

    static {
        locations.add(new RentalLocation("Store A", Arrays.asList("Speed", "Batman")));
        locations.add(new RentalLocation("Store B", Arrays.asList("Titanic", "Superman", "Speed")));
        locations.add(new RentalLocation("Store C", Arrays.asList("Fight Club", "Jumanji")));
    }

    public List<RentalLocation> find(String zipcode, int miles) {
        return locations;
    }
}
