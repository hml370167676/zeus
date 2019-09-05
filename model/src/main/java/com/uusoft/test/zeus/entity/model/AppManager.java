package com.uusoft.test.zeus.entity.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AppManager implements Serializable {
    private Integer appid;

    private String appname;

    private Date creattime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

   /* public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appid=").append(appid);
        sb.append(", appname=").append(appname);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }*/
}