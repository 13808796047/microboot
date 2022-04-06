package com.summer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author Summer
 * @date 2022/4/6 0:47
 */
@Data
public class BaseEntity{
    @TableId
    private Long id;
}
