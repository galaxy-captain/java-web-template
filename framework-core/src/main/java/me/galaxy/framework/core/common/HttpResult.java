package me.galaxy.framework.core.common;

import lombok.Data;
import me.galaxy.framework.core.exception.Exceptions;
import me.galaxy.framework.core.exception.ServiceException;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-20 14:46
 **/
@Data
public class HttpResult<T> {

    public enum Status {

        OK("OK", "200"),
        FORWARD("FORWARD", "300"),
        ERROR("ERROR", "500");

        private String status;

        private String code;

        Status(String status, String code) {
            this.status = status;
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public String getCode() {
            return code;
        }

    }

    public String status;

    public String code;

    private String msg;

    private String exception;

    private T data;

    public static HttpResult failed(ServiceException ex) {
        HttpResult result = new HttpResult();
        result.setStatus(ex.getStatus());
        result.setCode(ex.getCode());
        result.setMsg(ex.getMessage());
        result.setException(Exceptions.stackTrace2String(ex));
        return result;
    }

}