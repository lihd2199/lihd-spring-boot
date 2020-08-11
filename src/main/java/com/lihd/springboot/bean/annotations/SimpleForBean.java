package com.lihd.springboot.bean.annotations;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author: li_hd
 * @date: 2020-08-11 14:04
 **/
@Component
public class SimpleForBean {

    @Bean(initMethod = "SimpleBeanInit", destroyMethod = "SimpleBeanDestroy")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Primary
    @Qualifier("simpleBean")
    public SimpleBean simpleBean() {
        return new SimpleBean(1,"2");
    }



}
