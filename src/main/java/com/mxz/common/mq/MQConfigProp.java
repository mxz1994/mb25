package com.mxz.common.mq;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * mq 配置
 *
 * @author mxz on 2020/09/19 17:30
 */
@ConfigurationProperties(prefix = "com.mxz.mq")
@Data
public class MQConfigProp implements EnvironmentAware {
    private static final String UNKNOWN = "unknown";
    /**
     * 注册存入数据库系统名.
     */
    private String appname = UNKNOWN;

    private Map<String, String> consumer = new HashMap<String, String>();
    private Map<String, MQProducer> producer = new HashMap<>();

    @Override
    public void setEnvironment(Environment environment) {
        String springAppName = environment.getProperty("spring.application.name", "");
        if(StringUtils.hasText(springAppName)) {
            setAppname(springAppName);
        }
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }
}
