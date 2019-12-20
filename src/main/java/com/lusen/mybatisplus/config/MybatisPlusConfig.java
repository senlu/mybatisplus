package com.lusen.mybatisplus.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author
 * @description
 * @data2019/11/23
 */
@Configuration
@MapperScan({"com.lusen.mybatisplus.dao"})
@EnableTransactionManagement
public class MybatisPlusConfig
{
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor()
    {
        PaginationInterceptor paginationInterceptor =
            new PaginationInterceptor();
        paginationInterceptor.setLimit(100);
        return paginationInterceptor;
    }
}
