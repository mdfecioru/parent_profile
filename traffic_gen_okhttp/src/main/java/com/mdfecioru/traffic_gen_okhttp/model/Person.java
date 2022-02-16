package com.mdfecioru.traffic_gen_okhttp.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Location location;
}
