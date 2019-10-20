package me.galaxy.framework.core.exception;

import me.galaxy.framework.core.common.HttpResult;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-20 15:12
 **/
public class ServiceException extends RuntimeException {

    private String status;

    private String code;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
        this.status = HttpResult.Status.ERROR.getStatus();
        this.code = HttpResult.Status.ERROR.getCode();
    }

    public ServiceException(String status, String message) {
        super(message);

        if (status == null || "".equals(status)) {
            this.status = HttpResult.Status.ERROR.getStatus();
        }

        this.code = HttpResult.Status.ERROR.getCode();
    }

    public ServiceException(String status, String code, String message) {
        super(message);
        this.status = status;
        this.code = code;
    }

    public ServiceException(String status, String code, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.code = code;
    }

    public ServiceException(String status, String message, Throwable cause) {
        super(message, cause);

        if (status == null || "".equals(status)) {
            this.status = HttpResult.Status.ERROR.getStatus();
        }

        this.code = HttpResult.Status.ERROR.getCode();
    }

    public ServiceException(Throwable cause) {
        super(cause);
        this.status = HttpResult.Status.ERROR.getStatus();
        this.code = HttpResult.Status.ERROR.getCode();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}