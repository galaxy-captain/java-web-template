package me.galaxy.framework.core.common;

import lombok.extern.slf4j.Slf4j;
import me.galaxy.framework.core.exception.ServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description Web全局异常处理
 * @Author galaxy-captain
 * @Date 2019-10-20 14:43
 **/
@Slf4j
@ControllerAdvice
public class WebGlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public HttpResult serviceExceptionHandler(Exception e) {

        ServiceException ex;

        if (e instanceof ServiceException) {
            ex = (ServiceException) e;
        } else {
            ex = new ServiceException(e);
        }

        log.error(ex.getMessage(), ex);

        return HttpResult.failed(ex);
    }

}