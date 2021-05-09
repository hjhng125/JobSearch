package com.jh.project.exception;

import com.jh.project.common.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    //#TODO 예외 핸들러 확인필요
    @ExceptionHandler(UserGuideException.class)
    public ResponseEntity<CommonResponse<Void>> UserGuideException(UserGuideException e) {

        return ResponseEntity.ok(
            CommonResponse.<Void>builder()
                .httpStatus(e.getHttpStatus())
                .message(e.getMessage())
                .result(null)
                .build());
    }
}
