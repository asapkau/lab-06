package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 *
 *
 *
 * This class tests the functionality of the CityList class.
 * It verifies adding cities and handling duplicate entries.
 *
 *
 *
 * @author Kaustubh Khilari
 * @version 1.0
 */
class CityListTest {

    /**
     *
     *
     *
     * Creates and returns a mock CityList containing one city.
     *
     *
     *
     * @return a CityList with one mock city added
     */
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    /**
     *
     *
     *
     * Creates and returns a mock City object.
     *
     *
     *
     * @return a sample City object representing Edmonton, Alberta
     */
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     *
     *
     *
     * Tests that a city can be successfully added to the CityList.
     * <p>
     *
     *
     * This test verifies that after adding a city, the size of the list increases
     * and that the list contains the newly added city.
     *
     *
     */
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    /**
     *
     *
     *
     * Tests that adding a duplicate city throws an IllegalArgumentException.
     * <p>
     *
     *
     * This ensures the CityList does not allow duplicate entries.
     *
     *
     */
    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    /**
     *
     *
     *
     * Tests the behavior of the getCities() method in CityList.
     * <p>
     *
     *
     * This ensures that cities are sorted alphabetically by their names.
     */
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));


        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);


        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    /**
     *
     *
     *
     * Tests that hasCity() correctly identifies cities in the list.
     */
    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        assertFalse(cityList.hasCity(city));
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
    }

    /**
     *
     *
     *
     * Tests that delete() removes a city if it exists.
     */
    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = mockCity();
        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    /**
     *
     *
     *
     * Tests that delete() throws an exception if the city does not exist.
     */
    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();
        City city = new City("Vancouver", "British Columbia");
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });
    }

    /**
     *
     *
     *
     * Tests that countCities() correctly returns the number of cities.
     */
    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        cityList.add(new City("Toronto", "Ontario"));
        assertEquals(2, cityList.countCities());
    }


}
