package com.zhou.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 01384526
 * @title: ResponssMessage
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/3014:38
 */
@Data
@AllArgsConstructor
public class ResponssMessage {

    private String code;

    private String message;

    public static ResponssMessage fail(String message){
        return new ResponssMessage("fail",message);
    }
}
