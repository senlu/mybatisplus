package com.lusen.mybatisplus.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lusen.mybatisplus.domain.Programmer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author
 * @description
 * @data2019/11/23
 */
@Repository
public interface ProgrammerDao extends BaseMapper<Programmer>
{
    /**
     *  按名字查询(对应xml文件里的selectByName)
     * @param name
     * @return
     */
    List<Programmer> selectByName(@Param("name") String name);

    /**
     * 分页查询
     * @param page
     * @return
     */
    @Select("select * from t_programmer")
    IPage<Programmer> listProgrammer(Page page);

}
