package io.project.app.people.controllers;

import io.project.app.people.services.PeopleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author armen
 */
@RestController
@RequestMapping("/api/v2/people")
@Slf4j
@AllArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/generate/new/data")
    public ResponseEntity<?> generate() {
        peopleService.generate();
        return ResponseEntity.status(HttpStatus.OK).body("done");

    }

    @GetMapping("/count")
    public ResponseEntity<?> count() {
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.count());
    }

    @GetMapping("/find/top")
    public ResponseEntity<?> top() {
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.top());
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<?> delete() {
        peopleService.delete();
        return ResponseEntity.status(HttpStatus.OK).body("Done");
    }

}
