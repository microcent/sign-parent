package cn.com.codeele.sign.exception;

import cn.com.codeele.sign.enums.ResponseCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private ResponseCode responseCode;

    public BusinessException(ResponseCode responseCode) {
        super(responseCode.getDesc());
        this.responseCode = responseCode;
    }

}
