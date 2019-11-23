package com.lusen.mybatisplus.dao;

import com.lusen.mybatisplus.domain.Programmer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @description
 * @data2019/11/23
 */
@SpringBootTest
class ProgrammerDaoDb2Test
{
    @Resource
    private ProgrammerDaoDb2 programmerDaoDb2;

    @Test
    void selectByName()
    {
        List<Programmer> programmerList = programmerDaoDb2.selectByName("lusen");
        programmerList.forEach(System.out::println);
    }
}
