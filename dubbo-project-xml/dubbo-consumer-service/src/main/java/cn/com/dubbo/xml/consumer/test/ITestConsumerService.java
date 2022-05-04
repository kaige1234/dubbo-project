package cn.com.dubbo.xml.consumer.test;

import cn.com.dubbo.xml.api.test.ITestApiService;
import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITestConsumerService  {

    public static void main(String[] args) {
        ITestApiService iTestApiService = null;
        ApplicationContext config =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");

        iTestApiService = config.getBean(ITestApiService.class);

        System.out.println(iTestApiService.qurtyTestName());


    }
}
