package com.zhou.test.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 01384526
 * @title: IpConvert
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/6/2611:28
 */
public class IpConvert extends ClassicConverter {

    private static final Logger logger = LoggerFactory
            .getLogger(ClassicConverter.class);

    private static final String  DEFAULTIP="0.0.0.0";

    @Override
    public String convert(ILoggingEvent event) {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            logger.info("ip convert error",e);
        }
        if(null!=address){
            return  address.getHostAddress();
        }
        return DEFAULTIP;
    }
}