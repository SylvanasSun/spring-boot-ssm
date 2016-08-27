package com.sun.sylvanas.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Druid数据源监控过滤器
 * <p>
 * Created by sylvanasp on 2016/8/27.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                // 忽略资源
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
        })
public class DruidStatusFilter extends WebStatFilter {
}
