package com.lihd.springboot.customertag;

import com.lihd.springboot.bean.customer.Customer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author: li_hd
 * @date: 2020-08-11 16:42
 **/
@Configuration
public class SimpleForCustomer implements InitializingBean {

    @Resource
    private Customer customer;

    @Override
    public void afterPropertiesSet() {
        System.out.println(customer.getId());
        System.out.println(customer.getName());

    }


}
