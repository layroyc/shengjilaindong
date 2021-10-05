package com.xiexin.bean;

import java.io.Serializable;

/**
 * address
 * @author 
 */
public class Address implements Serializable {
    private Integer aid;

    private String addressname;

    private Integer parentid;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Address other = (Address) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getAddressname() == null ? other.getAddressname() == null : this.getAddressname().equals(other.getAddressname()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getAddressname() == null) ? 0 : getAddressname().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", addressname=").append(addressname);
        sb.append(", parentid=").append(parentid);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}