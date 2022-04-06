package com.summer.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.summer.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Summer
 * @since 2022-04-06
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("gygy_data_num")
@ApiModel(value = "DataNum对象", description = "")
public class DataNum extends BaseEntity {

    @TableField("`type`")
    private Integer type;

    @TableField("`data`")
    private String data;

    @TableField("`number`")
    private String number;


}
