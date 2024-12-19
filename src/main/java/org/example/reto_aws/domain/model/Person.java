package org.example.reto_aws.domain.model;

public class Person {

    private String name;
    private String email;
    private String identification;

    public Person(String name, String email, String identification) {
        this.name = name;
        this.email = email;
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }
}
