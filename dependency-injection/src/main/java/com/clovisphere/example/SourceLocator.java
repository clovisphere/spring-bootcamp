package com.clovisphere.example;

import java.util.List;

public interface SourceLocator {
    public List<RentalLocation> find(String zipcode, int miles);
}
