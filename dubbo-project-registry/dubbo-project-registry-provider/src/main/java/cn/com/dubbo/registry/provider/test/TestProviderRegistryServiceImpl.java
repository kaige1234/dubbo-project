package cn.com.dubbo.registry.provider.test;

import cn.com.dubbo.registry.test.ITestRegistryService;

public class TestProviderRegistryServiceImpl implements ITestRegistryService {

    public String queryRegistry() {
        return "调用-dubbo-注册中心服务3333";
    }
}
