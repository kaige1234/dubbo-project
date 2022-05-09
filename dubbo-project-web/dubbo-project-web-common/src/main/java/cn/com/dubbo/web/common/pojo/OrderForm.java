package cn.com.dubbo.web.common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderForm {
    private String id;

    private String userName;

    private Date addTime;
}
