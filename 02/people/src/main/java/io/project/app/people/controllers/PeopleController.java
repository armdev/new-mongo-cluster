/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.project.app.people.controllers;

import io.project.app.people.domain.People;
import io.project.app.people.services.PeopleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armen
 */
@RestController
@RequestMapping("/api/v2/people")
@RequiredArgsConstructor
@Slf4j
public class PeopleController {

    private final PeopleService peopleService;

    @PostMapping("/create")
    public ResponseEntity<?> add(@RequestBody People people) {
        peopleService.save(people);

        return ResponseEntity.status(HttpStatus.OK).body("done");

    }

    @GetMapping("/view")
    public ResponseEntity<?> view() {

        return ResponseEntity.status(HttpStatus.OK).body(peopleService.find());
    }

}
