package com.xgh.common.page;

import java.util.List;

/**
 * Created by DELL on 2018/9/13.
 */
public class ResponsePageBody<T>
{
    private String status;//0:失败；1：成功

    private String msg;

    private Long total;
    private List<T> rows;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
