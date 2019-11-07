package com.example.springdemo.config;

import com.example.springdemo.Bean.Student;
import com.sun.scenario.effect.impl.prism.PrReflectionPeer;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;

/**
 * @Author: fnbory
 * @Date: 7/11/2019 下午 2:27
 */
public class BfProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        for(String befinition:registry.getBeanDefinitionNames()) System.out.println(befinition);

        BeanDefinitionHolder holder = createBeanDefinition(Student.class.getName());
        BeanDefinitionReaderUtils.registerBeanDefinition(holder, registry);
        System.out.println(registry.getBeanDefinition("student"));
    }

    private BeanDefinitionHolder createBeanDefinition(String className) {
        BeanDefinitionBuilder definition = BeanDefinitionBuilder.genericBeanDefinition(Student.class);
        definition.addPropertyValue("name", "ffbbb");
        return new BeanDefinitionHolder(definition.getBeanDefinition(), "student");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
