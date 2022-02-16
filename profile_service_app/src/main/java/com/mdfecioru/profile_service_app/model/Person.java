package com.mdfecioru.profile_service_app.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String metadata;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Location location;
}
