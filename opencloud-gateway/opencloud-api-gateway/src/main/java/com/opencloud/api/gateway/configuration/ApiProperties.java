package com.opencloud.api.gateway.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Set;

/**
 * 自定义网关配置
 *
 * @author: liuyadu
 * @date: 2018/11/23 14:40
 * @description:
 */
@ConfigurationProperties(prefix = "opencloud.api")
public class ApiProperties {
    /**
     * 是否开启签名验证
     */
    private Boolean checkSign = true;
    /**
     * 是否开启动态访问控制
     */
    private Boolean accessControl = true;

    /**
     * 是否开启swagger调试
     */
    private Boolean enableSwagger = false;

    /**
     * 始终放行
     */
    private Set<String> permitAll;

    /**
     * 无需鉴权的请求
     */
    private Set<String> authorityIgnores;


    public Boolean getCheckSign() {
        return checkSign;
    }

    public void setCheckSign(Boolean checkSign) {
        this.checkSign = checkSign;
    }

    public Boolean getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(Boolean accessControl) {
        this.accessControl = accessControl;
    }

    public Boolean getEnableSwagger() {
        return enableSwagger;
    }

    public void setEnableSwagger(Boolean enableSwagger) {
        this.enableSwagger = enableSwagger;
    }

    public Set<String> getPermitAll() {
        return permitAll;
    }

    public void setPermitAll(Set<String> permitAll) {
        this.permitAll = permitAll;
    }

    public Set<String> getAuthorityIgnores() {
        return authorityIgnores;
    }

    public void setAuthorityIgnores(Set<String> authorityIgnores) {
        this.authorityIgnores = authorityIgnores;
    }
}