package com.crm.pvt.hapinicrm.models;

public class Admin {
    private String Passcode,Password,Name,Email,City,Phone;

    Admin(){

    }

    public Admin(String passcode, String password, String name, String email) {
        Passcode = passcode;
        Password = password;
        Name = name;
        Email = email;
    }

    public String getPasscode() {
        return Passcode;
    }

    public void setPasscode(String passcode) {
        Passcode = passcode;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
