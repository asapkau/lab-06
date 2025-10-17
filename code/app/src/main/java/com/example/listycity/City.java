package com.example.listycity;

/**
 *
 *
 *
 *
 * This class defines a City object that has a city name and a province name.
 * It provides methods to access both attributes and implements Comparable
 * to allow comparison of City objects based on their city names.
 * <p>
 *
 *
 * This class is used to represent a city in the ListyCity application.
 * Each City object stores information about its name and its province.
 *
 *
 *
 * @author Kaustubh Khilari
 * @version 1.0
 */
public class City implements Comparable {

    /**
     *
     *
     *
     * The name of the city.
     */
    private String city;

    /**
     *
     *
     *
     * The name of the province the city belongs to.
     */
    private String province;

    /**
     *
     *
     *
     * Constructs a new City object with the specified city and province names.
     * <p>
     *
     *
     * This constructor initializes the City object with values provided
     * by the user or other components of the ListyCity application.
     *
     *
     *
     * @param city the name of the city
     * @param province the name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     *
     *
     *
     * Returns the name of the city.
     * <p>
     *
     *
     * This method retrieves the city’s name from the City object.
     *
     *
     *
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     *
     *
     *
     * Returns the name of the province.
     * <p>
     *
     *
     * This method retrieves the province’s name from the City object.
     *
     *
     *
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     *
     *
     *
     * Compares this City object with another City object based on their names.
     * <p>
     *
     *
     * This method enables sorting of City objects alphabetically by city name.
     *
     *
     *
     * @param o the other City object to compare with
     * @return 0 if equal, a positive number if this city name is lexicographically
     * greater, or a negative number if smaller
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     *
     *
     *
     * Checks whether two City objects are equal based on city name and province.
     *
     * @param obj the object to compare
     * @return true if both cities have the same name and province, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City cityObj = (City) obj;
        return this.city.equals(cityObj.getCityName()) &&
                this.province.equals(cityObj.getProvinceName());
    }

    /**
     *
     *
     *
     * Returns a hash code based on city name and province.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return (city + province).hashCode();
    }
}
