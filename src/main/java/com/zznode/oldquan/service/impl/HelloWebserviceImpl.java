package com.zznode.oldquan.service.impl;

import com.zznode.oldquan.service.HelloWebservice;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @author : zhanyang.quan
 * @description :
 * @create : 2019/8/5  9:35
 */
@WebService(name = "HelloWebservice",
    targetNamespace = "http://service.oldquan.zznode.com",
    endpointInterface = "com.zznode.oldquan.service.HelloWebservice")
@Component
public class HelloWebserviceImpl implements HelloWebservice {

    @Override
    public String hello() {
        return "hello Webservice";
    }
}
