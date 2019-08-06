package com.zznode.oldquan.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author : zhanyang.quan
 * @description :
 * @create : 2019/8/5  9:28
 */
@WebService(name = "HelloWebservice",
    targetNamespace = "http://service.oldquan.zznode.com")
public interface HelloWebservice {
    @WebMethod
    public String hello();
}
