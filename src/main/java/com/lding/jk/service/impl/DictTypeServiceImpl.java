package com.lding.jk.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lding.jk.mapper.DictTypeMapper;
import com.lding.jk.pojo.po.DictType;
import com.lding.jk.pojo.query.DictTypeQuery;
import com.lding.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class DictTypeServiceImpl
        extends ServiceImpl<DictTypeMapper, DictType> implements DictTypeService {
    @Autowired
    private DictTypeMapper mapper;
    /* 条件查询 */
    @Override
    public void list(DictTypeQuery query) {
        // 查询条件
        LambdaQueryWrapper<DictType> wrapper = new LambdaQueryWrapper<>();
        String keyword = query.getKeyword();
        // Lambda表达式的方法引用【类型::方法】
        if (!StringUtils.isEmpty(keyword)) {
            wrapper.like(DictType::getName, keyword).or()
                    .like(DictType::getValue, keyword).or()
                    .like(DictType::getIntro, keyword);
        }
        // 在条件查询的基础上添加分页
        Page<DictType> page = new Page<>(query.getPage(), query.getSize());
        this.mapper.selectPage(page, wrapper);
        // 追加填充返回结果
        query.setResultData(page.getRecords());
        query.setCount(page.getTotal());
        query.setPages(page.getPages());
    }
}
