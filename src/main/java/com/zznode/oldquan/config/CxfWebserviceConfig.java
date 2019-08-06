package com.zznode.oldquan.config;

import com.zznode.oldquan.service.HelloWebservice;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author : zhanyang.quan
 * @description :
 * @create : 2019/8/5  9:38
 */
@Configuration
public class CxfWebserviceConfig {
    @Autowired
    private Bus bus;
    @Autowired
    private HelloWebservice helloWebservice;
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, helloWebservice);
        endpoint.publish("/HelloWebService");
        return endpoint;
    }
}
