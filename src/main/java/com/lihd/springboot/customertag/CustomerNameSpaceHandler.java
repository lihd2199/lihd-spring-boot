package com.lihd.springboot.customertag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: li_hd
 * @date: 2020-08-11 16:23
 **/
public class CustomerNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("config", new CustomerBeanDefinitionParser());
    }
}
