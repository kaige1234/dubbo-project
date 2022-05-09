package cn.com.doubb.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provder")
public class TestProviderController {
//    @Autowired
//    private ITestProvider iTestProvider;

    @RequestMapping("/queryProvider")
    public String queryProvider(){
       String str =  "";//iTestProvider.queryTestProvider();
       return str;
    }
}
