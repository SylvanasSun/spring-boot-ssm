package com.sun.sylvanas.controller;

import com.sun.sylvanas.pojo.Animal;
import com.sun.sylvanas.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sylvanasp on 2016/8/25.
 */
@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping("/animal/{id}")
    public Animal findAnimalById(@PathVariable("id") Long id) {
        return animalService.findAnimalById(id);
    }

}
