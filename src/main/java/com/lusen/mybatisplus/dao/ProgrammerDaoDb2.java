package com.lusen.mybatisplus.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lusen.mybatisplus.domain.Programmer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @description
 * @data2019/11/23
 **/
@DS("db2")
@Repository
public interface ProgrammerDaoDb2 extends BaseMapper<Programmer>
{
    /**
     *  按名字查询(对应xml文件里的selectByName)
     * @param name
     * @return
     */
    List<Programmer> selectByName(@Param("name") String name);
}
