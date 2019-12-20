package com.lusen.mybatisplus.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lusen.mybatisplus.domain.Programmer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProgrammerDaoTest
{

    @Resource
    private ProgrammerDao programmerDao;
    
    @Test
    void selectByName()
    {
        List<Programmer> programmerList = programmerDao.selectByName("");
        programmerList.forEach(System.out::println);
    }
    @Test
    void listProgrammer()
    {
        Page<Programmer> page = new Page();
        programmerDao.listProgrammer(page);
        page.getRecords().forEach(System.out::println);
    }

    @Test
    void insert()
    {
        Programmer p = new Programmer(3L,"C++","c++程序员","男",new Date());

        programmerDao.insert(p);
    }
}