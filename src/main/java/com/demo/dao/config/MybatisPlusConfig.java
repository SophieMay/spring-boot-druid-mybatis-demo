package com.demo.dao.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;

/**
 * config mybatis
 *
 * @author sophie
 * @date 2019-08-28 10:07
 */

@MapperScan("com.demo.dao.mapper")
public class MybatisPlusConfig {

    /**
     * mybatis分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
