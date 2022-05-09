package cn.com.dubbo.web.provider;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProjectWebProviderServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        //Main.main(args);
        String configPath="classpath*:META-INF/spring/*.xml";
        new ClassPathXmlApplicationContext(configPath.split("[,\\s]+")).start();
        Thread.currentThread().join();
    }
}
