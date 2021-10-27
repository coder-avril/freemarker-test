package com.lding.jk.pojo.query;

import com.lding.jk.util.Const;
import lombok.Data;
import java.util.List;

@Data
public class PageQuery<T> {
    /* 页码 */
    private long page;
    /* 页面显示的件数 */
    private long size;

    /* 返回结果的具体数据 */
    private List<T> resultData;
    /* 返回结果的总件数 */
    private long count;
    /* 返回结果的总页数 */
    private long pages;

    /* 程序健壮性 */
    public long getPage() {
        return Math.max(Const.DEFAULT_PAGE, page);
    }
    public long getSize() {
        return (size < 1) ? Const.DEFAULT_SIZE : size;
    }
}
