package com.sun.sylvanas.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sun.sylvanas.dao.mapper.AnimalMapper;
import com.sun.sylvanas.pojo.Animal;
import com.sun.sylvanas.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by sylvanasp on 2016/8/25.
 */
// 这里的@Service使用的是dubbo包下的@Service注解.
@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalMapper animalMapper;

    @Override
    public Animal findAnimalById(Long id) {
        return animalMapper.findAnimalById(id);
    }

}
