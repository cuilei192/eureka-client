package com.cui.client.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HiController {


    @Value("${server.port}")
    String port;
    
    @Value("${spring.application.name}")
    String applicationName;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) throws UnknownHostException {
    	InetAddress localHost = InetAddress.getLocalHost();
    	String hostAddress = localHost.getHostAddress();
        return "hi " + name + " ,i am from "+hostAddress+":"+port+","+applicationName;
    }


}
