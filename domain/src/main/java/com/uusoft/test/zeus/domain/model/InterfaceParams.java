package com.uusoft.test.zeus.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InterfaceParams implements Serializable {
    private Integer paramid;

    private String paramnamezh;

    private String paramnameen;

    private String paramtype;

    private String mandatorytype;

    private String instruction;

    private Date creattime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

  /*  public Integer getParamid() {
        return paramid;
    }

    public void setParamid(Integer paramid) {
        this.paramid = paramid;
    }

    public String getParamnamezh() {
        return paramnamezh;
    }

    public void setParamnamezh(String paramnamezh) {
        this.paramnamezh = paramnamezh == null ? null : paramnamezh.trim();
    }

    public String getParamnameen() {
        return paramnameen;
    }

    public void setParamnameen(String paramnameen) {
        this.paramnameen = paramnameen == null ? null : paramnameen.trim();
    }

    public String getParamtype() {
        return paramtype;
    }

    public void setParamtype(String paramtype) {
        this.paramtype = paramtype == null ? null : paramtype.trim();
    }

    public String getMandatorytype() {
        return mandatorytype;
    }

    public void setMandatorytype(String mandatorytype) {
        this.mandatorytype = mandatorytype == null ? null : mandatorytype.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
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
        sb.append(", paramid=").append(paramid);
        sb.append(", paramnamezh=").append(paramnamezh);
        sb.append(", paramnameen=").append(paramnameen);
        sb.append(", paramtype=").append(paramtype);
        sb.append(", mandatorytype=").append(mandatorytype);
        sb.append(", instruction=").append(instruction);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }*/
}