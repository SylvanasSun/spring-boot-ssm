package com.sun.sylvanas.service.impl;

import com.sun.sylvanas.dao.mapper.AnimalMapper;
import com.sun.sylvanas.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by sylvanasp on 2016/8/25.
 */
@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalMapper animalMapper;

    @Override
    public Animal findAnimalById(Long id) {
        return animalMapper.findAnimalById(id);
    }

}
