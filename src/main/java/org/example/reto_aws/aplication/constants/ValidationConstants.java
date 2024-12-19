package org.example.reto_aws.aplication.constants;

public class ValidationConstants {

    public static final int THERE = 3;
    public static final int TWENTY = 20;
    public static final int ONEHUNDRED = 100;
    public static final int ONEHUNDRED_FIFTY = 150;

    public static final String CREATE_PERSON_SYSTEM = "Create a new person in the system";
    public static final String IDENTIFICATION = "/{identification}";
    public static final String SAVE_PERSON = "Save a person";
    public static final String IDENTIFICATION_REQUIRED = "The identification number is required.";
    public static final String IDENTIFICATION_NUMBER = "identificacion";
    public static final String NAME_MIN_SIZE = "The name must be at least 3 characters.";
    public static final String NAME_REQUIRED = "name is required";
    public static final String NAME = "name";
    public static final String EMAIL = "email";

    public static final String EMAIL_FORMAT = "The email is not in a valid format.";
    public static final String EMAIL_REQUIRED = "Email is required.";
    public static final String RESTAURANTS_API = "Documentation for the People Management API";

    public static final String HTTP_SPRINGDOC = "http://springdoc.org";
    public static final String EXAMPLE_COM = "https://example.com";
    public static final String ADDITIONAL_DOCUMENTATION = "Additional documentation";
    public static final String VERSION = "1.0.0";

    public static final String APACHE = "Apache 2.0";
    public static final String PEOPLE_API = "People Management API";

    private ValidationConstants() {
        throw new IllegalStateException("Utility class");
    }
}
