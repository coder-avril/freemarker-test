package com.lding.jk.pojo.query;

import com.lding.jk.pojo.po.DictType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DictTypeQuery extends KeywordQuery<DictType> {
    /* 可以添加更多的项目，方便拓展 */
}
