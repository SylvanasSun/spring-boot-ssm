package com.sun.sylvanas.dao.mapper;

import com.sun.sylvanas.pojo.Animal;
import org.apache.ibatis.annotations.Param;

/**
 * Created by sylvanasp on 2016/8/25.
 */
public interface AnimalMapper {

    Animal findAnimalById(@Param("id") Long id);

}
