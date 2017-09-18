package com.lxt.repository;

import com.lxt.dimain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author liuxutao-64
 * @create 2017-09-18 13:14
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄来查询
    List<Girl> findByAge(Integer age);
}
