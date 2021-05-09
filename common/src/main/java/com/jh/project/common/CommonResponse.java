package com.jh.project.common;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class CommonResponse<T> {

    private final HttpStatus httpStatus;
    private final String message;
    private final T result;

    @Builder
    public CommonResponse(HttpStatus httpStatus, String message, T result) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.result = result;
    }
}
