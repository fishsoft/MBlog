package com.morse.entites;

/**
 * Created by 程 on 2016/11/27.
 */
public class PageSplit {
    private int pageNum,pageSize;

    @Override
    public String toString() {
        return "PageSplit{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
