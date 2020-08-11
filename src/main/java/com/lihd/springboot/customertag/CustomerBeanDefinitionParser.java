package com.lihd.springboot.customertag;

import com.lihd.springboot.bean.customer.Customer;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @author: li_hd
 * @date: 2020-08-11 16:18
 **/
public class CustomerBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(@NotNull Element element) {
        return Customer.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        final String id = element.getAttribute("id");
        final String name = element.getAttribute("name");
        builder.addPropertyValue("id", Integer.valueOf(id));
        builder.addPropertyValue("name", name);
    }
}
