package com.lding.jk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lding.jk.pojo.po.DictType;
import com.lding.jk.pojo.query.DictTypeQuery;

public interface DictTypeService extends IService<DictType> {
    /* 条件查询 */
    void list(DictTypeQuery query);
}
