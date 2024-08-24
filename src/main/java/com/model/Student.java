package com.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private int sid;
    private String sname;
    private String scity;
    private double spercentage;
    private Map<String,List<String>> details = new HashMap<>();
    private Address address;
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public int getSid() {
        return sid;
    }
    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
                + ", details=" + details + ", address=" + address + "]";
    }
    public String getSname() {
        return sname;
    }
    public String getScity() {
        return scity;
    }
    public double getSpercentage() {
        return spercentage;
    }
    public Map<String, List<String>> getDetails() {
        return details;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public void setScity(String scity) {
        this.scity = scity;
    }
    public void setSpercentage(double spercentage) {
        this.spercentage = spercentage;
    }
    public void setDetails(Map<String, List<String>> details) {
        this.details = details;
    }

}
