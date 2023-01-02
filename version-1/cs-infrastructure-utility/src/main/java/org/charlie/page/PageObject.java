package org.charlie.page;

import java.util.List;

/**
 * 分页对象
 *
 * @author Charlie-6327
 * @date 2022/12/29
 */
public class PageObject<T> {

    private Long total;

    private Long pageIndex;

    private Long pageSize;

    private List<T> data;

    public void buildPage(List<T> data, Long total, Long pageIndex, Long pageSize) {
        this.data = data;
        this.total = total;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }
}
