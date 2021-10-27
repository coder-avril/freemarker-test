package com.lding.jk.pojo.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class KeywordQuery<T> extends PageQuery<T> {
    /* 关键字 */
    private String keyword;
}
