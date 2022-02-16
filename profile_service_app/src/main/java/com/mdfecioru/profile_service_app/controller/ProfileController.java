package com.mdfecioru.profile_service_app.controller;

import com.mdfecioru.profile_service_app.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

@RestController
public class ProfileController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/person")
    public ResponseEntity<Person> updatePerson(
            @RequestBody Person person
    ) {
        Random rand = new Random();
        int randVal = rand.nextInt(1000);
        InetAddress ia;
        String hostname = "unknown";

        try {
            ia = InetAddress.getLocalHost();
            hostname = ia.getHostName();
        } catch (UnknownHostException e) {
            logger.error("Error in getting hostname: " + e);
        }

        person.setMetadata(hostname);
        logger.info("Received person details: " + person);


        if (randVal % 3 == 0) {
            logger.info("Sending a 500 internal error message: " + HttpStatus.INTERNAL_SERVER_ERROR);
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(person);
        }

        logger.info("Sending a 200 OK message: " + HttpStatus.ACCEPTED);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(person);
    }
}
