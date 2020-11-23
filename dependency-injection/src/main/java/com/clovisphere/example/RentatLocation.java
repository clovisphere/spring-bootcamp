package com.clovisphere.example;

import java.util.List;

class RentalLocation {
    private final String location;
    private final List<String> titles;

    public RentalLocation(final String location, final List<String> titles) {
        this.location = location;
        this.titles = titles;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getTitles() {
        return titles;
    }
}

