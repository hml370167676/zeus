package com.uusoft.test.zeus.domain.model;

import java.io.Serializable;
import java.util.Date;

public class EnvManager implements Serializable {
    private Integer envid;

    private String envname;

    private String envurl;

    private Date creattime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getEnvid() {
        return envid;
    }

    public void setEnvid(Integer envid) {
        this.envid = envid;
    }

    public String getEnvname() {
        return envname;
    }

    public void setEnvname(String envname) {
        this.envname = envname == null ? null : envname.trim();
    }

    public String getEnvurl() {
        return envurl;
    }

    public void setEnvurl(String envurl) {
        this.envurl = envurl == null ? null : envurl.trim();
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
        sb.append(", envid=").append(envid);
        sb.append(", envname=").append(envname);
        sb.append(", envurl=").append(envurl);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}