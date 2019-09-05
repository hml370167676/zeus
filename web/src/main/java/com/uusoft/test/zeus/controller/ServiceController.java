package com.uusoft.test.zeus.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@Slf4j
public class ServiceController {

    private RestTemplate restTemplate;

    private EurekaClient eurekaClient;

    @RequestMapping(value = "/getMicroServices", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public String testController1(){
        StringBuilder sb = new StringBuilder();
        Applications applications = eurekaClient.getApplications();

        for(Application application : applications.getRegisteredApplications()) {
            try {
                //通过swagger查询服务接口的接口来获取该服务节点下的所有服务接口明细
                String rsp = restTemplate.getForEntity("http://" + application.getName() + "/v2/api-docs", String.class).getBody();
                //使用fastjson进行解析
                JSONObject apiObject = JSON.parseObject(rsp);
                JSONObject pathsObject = apiObject.getJSONObject("paths");
                for (Map.Entry<String, Object> path : pathsObject.entrySet()) {
                    System.out.println(path.getKey());
                }
                sb.append(rsp);
            }catch(Exception ex){
                //这里需要注意对于没有使用swagger的服务是无法调用swagger接口的，会抛出异常，需要对异常捕获后继续执行
                continue;
            }
        }
        return sb.toString();
    }
}
