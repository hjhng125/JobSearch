package com.jh.project.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.logging.LogLevel;

@Getter
@RequiredArgsConstructor
public enum ErrorMessage {

    COMMON_SYSTEM_ERROR(LogLevel.ERROR, "시스템 장애입니다."),
    COMMON_SUCCESS(LogLevel.OFF, "정상입니다."),

    USER_NOT_FOUND(LogLevel.ERROR, "계정을 찾을 수 없습니다.");

    private final LogLevel logLevel;
    private final String errorMessage;
}
