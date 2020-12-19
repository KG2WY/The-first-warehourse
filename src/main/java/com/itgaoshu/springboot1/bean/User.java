package com.itgaoshu.springboot1.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
//实现序列接口
@Table(name= "test2")
public class User implements Serializable {
    //降属性改为相应的包装类
    @Id
    private Integer tid;
    private String tname;



    private Double tsalary;
    private String tdate;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Double getTsalary() {
        return tsalary;
    }

    public void setTsalary(Double tsalary) {
        this.tsalary = tsalary;
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate;
    }
}
