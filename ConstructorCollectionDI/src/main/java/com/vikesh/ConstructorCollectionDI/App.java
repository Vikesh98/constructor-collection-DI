package com.vikesh.ConstructorCollectionDI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	
        Resource res=new ClassPathResource("spring.xml");
        BeanFactory factory=new XmlBeanFactory(res);
        Details obj=(Details) factory.getBean("call");
        obj.display();
    }
}
