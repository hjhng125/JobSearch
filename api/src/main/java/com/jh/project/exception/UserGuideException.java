package com.jh.project.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class UserGuideException extends RuntimeException{

    private ErrorMessage errorMessage = ErrorMessage.COMMON_SYSTEM_ERROR;
    private final HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

    public UserGuideException(Throwable cause) {
        super(cause);
    }

    public UserGuideException(ErrorMessage errorMessage) {
        super(errorMessage.getErrorMessage());
        this.errorMessage = errorMessage;
    }

    public UserGuideException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage.getErrorMessage(), cause);
        this.errorMessage = errorMessage;
    }

}
