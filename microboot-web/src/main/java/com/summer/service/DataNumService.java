package com.summer.service;

import com.summer.entity.DataNum;
import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.utils.Result;
import com.summer.vo.PageVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Summer
 * @since 2022-04-06
 */
public interface DataNumService extends IService<DataNum> {

    Result getList(Integer page, Integer pageSize, String type);
}
