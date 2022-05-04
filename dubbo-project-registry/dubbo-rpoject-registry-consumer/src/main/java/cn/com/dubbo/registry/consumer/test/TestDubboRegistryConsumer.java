package cn.com.dubbo.registry.consumer.test;


import cn.com.dubbo.registry.test.ITestRegistryService;
import org.apache.dubbo.rpc.service.EchoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDubboRegistryConsumer {
    public static void main(String[] args) {
        ITestRegistryService iTestRegistryService = null;

        ApplicationContext config =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/application.xml");
//        iTestRegistryService = config.getBean(ITestRegistryService.class);
//        System.out.println(iTestRegistryService.queryRegistry());

        //回声测试

        EchoService echoService = (EchoService)config.getBean(ITestRegistryService.class);
        Object ok = echoService.$echo("OK");
        System.out.println(ok);
    }
}
