package com.summer.controller;


import com.summer.entity.DataNum;
import com.summer.service.DataNumService;
import com.summer.utils.Result;
import com.summer.vo.PageVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Summer
 * @since 2022-04-06
 */
@Api(tags = "首页接口测试")
@RestController
@RequestMapping("api/data-nums")
public class DataNumController {
    @Autowired
    DataNumService dataNumService;

    @GetMapping
    public Result index(Integer page, Integer pageSize, String type) {
        return dataNumService.getList(page,pageSize,type);
    }
}
