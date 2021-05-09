package com.atguigu.servicebase.config.exceptionhandler;


import com.atguigu.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
//        log.error(e.getMessage());
        log.error(ExceptionUtil.getMessage(e));
        e.printStackTrace();
        return  R.error().message("执行了全局异常");
    }
//    @Override
//    public String toString() {
//        return "GlobalExceptionHandler{" +
//                "message=" + this.getMessage() +
//                ", code=" + code +
//                '}';
//    }
}
