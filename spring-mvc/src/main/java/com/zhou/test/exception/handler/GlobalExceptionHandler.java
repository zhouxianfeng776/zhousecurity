package com.zhou.test.exception.handler;

import com.zhou.test.model.ResponssMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * @author 01384526
 * @title: GlobalExceptionHandler
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/3014:37
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponssMessage constraintViolationException(ConstraintViolationException e){
        log.error("参数约束异常{}" + e);
        return ResponssMessage.fail(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponssMessage handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        FieldError fieldError = result.getFieldError();
        return ResponssMessage.fail(fieldError.getDefaultMessage());
    }
}
