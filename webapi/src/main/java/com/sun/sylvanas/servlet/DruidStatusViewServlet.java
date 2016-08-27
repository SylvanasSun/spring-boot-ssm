package com.sun.sylvanas.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Druid数据源监控统计Servlet
 * <p>
 * Created by sylvanasp on 2016/8/27.
 */
@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = ""),// IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name = "deny", value = ""),// IP黑名单 (存在共同时，deny优先于allow)
                @WebInitParam(name = "loginUsername", value = "druid"),// 用户名
                @WebInitParam(name = "loginPassword", value = "druid"),// 密码
                @WebInitParam(name = "resetEnable", value = "false")// 禁用HTML页面上的“Reset All”功能
        })
public class DruidStatusViewServlet extends StatViewServlet {
}