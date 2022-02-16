package com.mdfecioru.traffic_gen_okhttp.gendata;

import com.mdfecioru.traffic_gen_okhttp.model.Location;
import com.mdfecioru.traffic_gen_okhttp.model.Person;

import java.time.LocalDate;

public class RandomPerson {
    public static Person next() {
        Person person = new Person();
        Location location = new Location();

        location.setCountry("US");
        location.setState("California");
        location.setCity("Cupertino");

        person.setFirstName("Mihai");
        person.setLastName("Fecioru");
        person.setBirthday(LocalDate.of(1978, 5, 25));
        person.setLocation(location);

        return person;

    }
}
