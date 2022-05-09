package cn.com.dubbo.web.provider.test;

import cn.com.dubbo.web.provider.api.test.ITestProvider;
import org.springframework.stereotype.Service;

@Service
public class TestProviderImpl implements ITestProvider {

    public String queryTestProvider() {
        return "获取到了数据";
    }
}
