package com.zhou.test.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 01384526
 * @title: LogAspect
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/6/2611:35
 */
//@Asp
//@Configuration
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // 定义切点Pointcut
    //@Pointcut("execution(* com.qkhc.chedai.controller..*.*(..))")
    public void excudeService() {
    }

    //@Around("excudeService()")
    /*public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        Object[] args = pjp.getArgs();
        String params = "";
        //获取请求参数集合并进行遍历拼接
        if(args.length>0){
            if("POST".equals(method)){
                Object object = args[0];
                Map map = getKeyAndValue(object);
                params = JSON.toJSONString(map);
                ;
            }else if("GET".equals(method)){
                params = queryString;
            }
        }


        logger.info("请求开始===地址:"+url);
        logger.info("请求开始===类型:"+method);
        logger.info("请求开始===参数:"+params);

        // result的值就是被拦截方法的返回值
        Object result = pjp.proceed();
        Gson gson = new Gson();
        logger.info("请求结束===返回值:" + gson.toJson(result));
        return result;
    }*/
}
