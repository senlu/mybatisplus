package com.lusen.mybatisplus.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lusen.mybatisplus.domain.Programmer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

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
        List<Programmer> programmerList = programmerDao.selectByName("lusen");
        programmerList.forEach(System.out::println);
    }
    @Test
    void listProgrammer()
    {
        Page<Programmer> page = new Page();
        programmerDao.listProgrammer(page);
        page.getRecords().forEach(System.out::println);
    }
}