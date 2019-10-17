package com.melted.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Action;

/**
 * Created by gtt on 2019/10/9.
 */
@Component
public class TokenFilter extends ZuulFilter{


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("=========进入到tokenFilter");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        Object token = request.getSession().getAttribute("token");
        if(token!=null){
            System.out.println(token.toString());
            return null;
        }else{
//            currentContext.setSendZuulResponse(false);
            return null;
        }

    }
}
