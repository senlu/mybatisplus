package com.lusen.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author
 * @description
 * @data2019/11/23
 */
@Data
@TableName("t_programmer")//对应数据库表名
@ToString
public class Programmer
{
    /**
     * 主键id
     */
    private Long id;

    /**
     * 程序员类型
     */
    private String type;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 入坑时间
     */
    private Date joinDate;

}
