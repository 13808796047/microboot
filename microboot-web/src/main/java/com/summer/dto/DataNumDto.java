package com.summer.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author Summer
 * @date 2022/4/6 11:20
 */
@Data
public class DataNumDto {
    @TableField("`type`")
    private Integer type;

    @TableField("`data`")
    private String data;

    @TableField("`number`")
    private String number;
}
