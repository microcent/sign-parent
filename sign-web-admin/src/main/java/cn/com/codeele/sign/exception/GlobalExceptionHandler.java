package cn.com.codeele.sign.exception;

import cn.com.codeele.sign.entity.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Response handleException(Exception e) {
        if (e instanceof BusinessException) {
            LOGGER.error(e.getMessage(), e);
            BusinessException exception = (BusinessException) e;
            return Response.failure(exception.getResponseCode(), exception.getResponseCode().getDesc());
        } else {
            return Response.failure();
        }
    }

}
