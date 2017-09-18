package com.lxt.service;

import com.lxt.dimain.Girl;
import com.lxt.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuxutao-64
 * @create 2017-09-18 15:04
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(17);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBB");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

}
