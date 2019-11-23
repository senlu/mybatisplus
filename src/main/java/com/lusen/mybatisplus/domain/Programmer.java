package com.lusen.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @author
 * @description
 * @data2019/11/23
 */
@TableName("t_programmer")//对应数据库表名
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

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Date getJoinDate()
    {
        return joinDate;
    }

    public void setJoinDate(Date joinDate)
    {
        this.joinDate = joinDate;
    }

    @Override
    public String toString()
    {
        return "Programmer{" + "id=" + id + ", type='" + type + '\''
            + ", name='" + name + '\'' + ", sex='" + sex + '\'' + ", joinDate="
            + joinDate + '}';
    }
}
