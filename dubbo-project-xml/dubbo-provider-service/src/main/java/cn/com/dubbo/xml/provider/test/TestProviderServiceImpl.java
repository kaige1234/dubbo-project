package cn.com.dubbo.xml.provider.test;

import cn.com.dubbo.xml.api.test.ITestApiService;

public class TestProviderServiceImpl implements ITestApiService {

    public String qurtyTestName() {
      return "调用生产者";
    }
}
