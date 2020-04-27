package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author SXD
 * @create 2020/4/13 15:46
 */
public interface PaymentService {

    // 新增数据
    public int create(Payment payment);

    //读 通过ID查询单条数据
    public Payment getPaymentById(@Param("id") Long id);
}
