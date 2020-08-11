package com.lihd.springboot.bean.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: li_hd
 * @date: 2020-08-11 14:04
 **/
@Data
@AllArgsConstructor
public class SimpleBean {

    private Integer id;

    private String name;

    public void SimpleBeanInit(){
        System.out.println("SimpleBeanInit");
    }

    public void SimpleBeanDestroy(){
        System.out.println("SimpleBeanDestroy");
    }

}
