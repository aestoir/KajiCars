package ca.georgiancollege.comp1011.kajicars;

import java.util.ArrayList;

public class Company {
    private String name;
    private String logoImagePath;
    private String streetName;
    private String city;
    private String province;
    private String postalCode;
    private ArrayList<Vehicle> soldVehicles;

    public Company(String name, String logoImagePath, String streetName, String city, String province, String postalCode) {
        this.name = name;
        this.logoImagePath = logoImagePath;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.soldVehicles = new ArrayList<Vehicle>();
    }

    // Getters and Setters for all the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoImagePath() {
        return logoImagePath;
    }

    public void setLogoImagePath(String logoImagePath) {
        this.logoImagePath = logoImagePath;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<Vehicle> getSoldVehicles() {
        return soldVehicles;
    }

    // Method to add a sold vehicle to the company's record
    public void addSoldVehicle(Vehicle vehicle) {
        soldVehicles.add(vehicle);
    }

    // Method to get the number of cars sold by the company
    public int getNumCarsSold() {
        return soldVehicles.size();
    }

    // Method to get the total profit made by the company
    public double getTotalProfit() {
        double totalProfit = 0.0;
        for (Vehicle vehicle : soldVehicles) {
            totalProfit += vehicle.getPrice();
        }
        return totalProfit;
    }
}
