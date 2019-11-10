package com.example.springdemo.config;

import com.example.springdemo.Bean.Account;
import com.example.springdemo.Bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: fnbory
 * @Date: 8/11/2019 下午 2:15
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("account")) {
            Account account = (Account) bean;
            account.setName("ffbbb");
            return account;
        }
        return bean;
    }
}
