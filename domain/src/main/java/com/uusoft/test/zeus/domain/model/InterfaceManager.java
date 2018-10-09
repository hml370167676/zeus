package com.uusoft.test.zeus.domain.model;

import java.io.Serializable;
import java.util.Date;

public class InterfaceManager implements Serializable {
    private Integer interfaceid;

    private String interfacename;

    private String inputparams;

    private String returnparams;

    private String instruction;

    private Integer encryption;

    private Integer interfacetype;

    private Integer appid;

    private Date creattime;

    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getInterfaceid() {
        return interfaceid;
    }

    public void setInterfaceid(Integer interfaceid) {
        this.interfaceid = interfaceid;
    }

    public String getInterfacename() {
        return interfacename;
    }

    public void setInterfacename(String interfacename) {
        this.interfacename = interfacename == null ? null : interfacename.trim();
    }

    public String getInputparams() {
        return inputparams;
    }

    public void setInputparams(String inputparams) {
        this.inputparams = inputparams == null ? null : inputparams.trim();
    }

    public String getReturnparams() {
        return returnparams;
    }

    public void setReturnparams(String returnparams) {
        this.returnparams = returnparams == null ? null : returnparams.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public Integer getEncryption() {
        return encryption;
    }

    public void setEncryption(Integer encryption) {
        this.encryption = encryption;
    }

    public Integer getInterfacetype() {
        return interfacetype;
    }

    public void setInterfacetype(Integer interfacetype) {
        this.interfacetype = interfacetype;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
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
        sb.append(", interfaceid=").append(interfaceid);
        sb.append(", interfacename=").append(interfacename);
        sb.append(", inputparams=").append(inputparams);
        sb.append(", returnparams=").append(returnparams);
        sb.append(", instruction=").append(instruction);
        sb.append(", encryption=").append(encryption);
        sb.append(", interfacetype=").append(interfacetype);
        sb.append(", appid=").append(appid);
        sb.append(", creattime=").append(creattime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}