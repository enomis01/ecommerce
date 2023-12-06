package it.paolone.ecommerce.dto;

public class CustomerDTO {
    // Customer Properties
    private String nominative;
    private String email;
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNominative(String nominative) {
        this.nominative = nominative;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNominative() {
        return nominative;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
