package com.jh.project.account;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    ADMIN("플랫폼 관리자"),
    SEEKER("구직자"),
    RECRUITER("채용인");

    private final String description;
}
