package com.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * user
 *
 * @author sophie
 * @date 2019-08-28 10:09
 */
@Data
@TableName("spider_competitors_product")
public class UserDTO {

    @TableField("SkuName")
    private String name;
}
