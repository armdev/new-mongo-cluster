/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.project.app.people.services;

import io.project.app.people.domain.People;
import io.project.app.people.repositories.PeopleRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author armen
 */
@Slf4j
@Service
public class PeopleService {
    
    private final PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    
    
    @Transactional
    public void save(People people){
        peopleRepository.save(people);
    }
    
    public List<People> find(){
        return peopleRepository.findAll();
    }
}
