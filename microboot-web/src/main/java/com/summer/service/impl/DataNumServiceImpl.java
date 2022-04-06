package com.summer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.summer.entity.DataNum;
import com.summer.mapper.DataNumMapper;
import com.summer.service.DataNumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.utils.BeanCopyUtils;
import com.summer.utils.Result;
import com.summer.vo.DataNumListVo;
import com.summer.vo.PageVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Summer
 * @since 2022-04-06
 */
@Service
public class DataNumServiceImpl extends ServiceImpl<DataNumMapper, DataNum> implements DataNumService {

    @Override
    public Result getList(Integer pageNum, Integer pageSize, String type) {
        // 查询所有数据
        LambdaQueryWrapper<DataNum> query = new LambdaQueryWrapper<>();
        query.eq(Objects.nonNull(type), DataNum::getType, type);
        // 分页
        Page<DataNum> page = new Page<>(Objects.nonNull(pageNum) ? pageNum : 1, Objects.nonNull(pageSize) ? pageSize : 10);
        page(page, query);
//        List<DataNum> dataNums = page.getRecords();
        // 转换vo
        List<DataNumListVo> dataNumVos = BeanCopyUtils.copyBeanList(page.getRecords(), DataNumListVo.class);
        PageVo pageVo = new PageVo<>(page.getCurrent(), page.getSize(), page.getTotal(), page.getPages(), dataNumVos);
        return Result.ok(pageVo);
    }
}
