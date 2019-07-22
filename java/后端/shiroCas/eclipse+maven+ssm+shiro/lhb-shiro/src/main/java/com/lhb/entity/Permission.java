package com.lhb.entity;

import java.io.Serializable;

public class Permission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pid;

    private String pname;

    private String remark;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}