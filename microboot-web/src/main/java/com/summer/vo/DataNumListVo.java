package com.summer.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Summer
 * @date 2022/4/6 11:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DataNum对象", description = "")
public class DataNumListVo {
    @ApiModelProperty("Id")
    private Long id;
    private Integer type;
    private String data;
    private String number;
}
