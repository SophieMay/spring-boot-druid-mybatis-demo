package com.demo.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.dao.entity.UserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * user mapper
 *
 * @author sophie
 * @date 2019-08-28 10:10
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDTO> {
}
