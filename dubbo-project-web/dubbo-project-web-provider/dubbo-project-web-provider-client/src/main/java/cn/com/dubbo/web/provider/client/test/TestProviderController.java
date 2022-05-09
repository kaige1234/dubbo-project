package cn.com.dubbo.web.provider.client.test;

import cn.com.dubbo.web.provider.api.test.ITestProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provder")
public class TestProviderController {
    Logger logger = LoggerFactory.getLogger(TestProviderController.class);
    @Autowired
    private ITestProvider iTestProvider;

    @RequestMapping("/queryProvider")
    public String queryProvider(){
        logger.info("调用了queryProvider");
       String str =  iTestProvider.queryTestProvider();
       return str;
    }
}
