package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 *
 *
 * This is a class that keeps track of a list of City objects.
 * <p>
 *
 *
 * It allows adding new City objects to the list and retrieving
 * them in sorted order according to their city names.
 *
 *
 *
 * @author Kaustubh Khilari
 * @version 1.0
 */
public class CityList {

    /**
     *
     *
     *
     * This is the list that holds City objects.
     */
    private List<City> cities = new ArrayList<>();

    /**
     *
     *
     *
     * This adds a city to the list if the city does not exist.
     * <p>
     *
     *
     * If the city already exists in the list, it throws an IllegalArgumentException.
     *
     *
     *
     * @param city This is a candidate City to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     *
     *
     * This returns a sorted list of cities.
     * <p>
     *
     *
     * The list is sorted alphabetically by city name using the compareTo() method.
     *
     *
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    /**
     *
     *
     *
     * Checks whether a given city exists in the list.
     *
     * @param city The City to search for
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     *
     *
     *
     * Deletes a city from the list if it exists, otherwise throws an exception.
     *
     * @param city The City to delete
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     *
     *
     *
     * Returns the number of cities currently in the list.
     *
     * @return the count of cities
     */
    public int countCities() {
        return cities.size();
    }
}
