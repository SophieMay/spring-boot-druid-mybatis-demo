package com.demo.dao.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * test user mapper
 *
 * @author sophie
 * @date 2019-08-28 10:16
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testMapper() {
        Integer count = userMapper.selectCount(null);
        Assert.assertNotNull(count);
    }
}
