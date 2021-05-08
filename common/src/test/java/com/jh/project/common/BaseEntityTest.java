package com.jh.project.common;

import static org.assertj.core.api.Assertions.assertThat;

import com.jh.project.account.Account;
import org.junit.jupiter.api.Test;

class BaseEntityTest {

    @Test
    void builder_test() {
        Account account = Account.builder()
            .email("hjhng125@nate.com")
            .userName("hjhng")
            .password("1234")
            .build();

        System.out.println(account);

        assertThat(account).isNotNull();
        assertThat(account.getEmail()).isEqualTo("hjhng125@nate.com");
        assertThat(account.getUserName()).isEqualTo("hjhng");
        assertThat(account.getPassword()).isEqualTo("1234");
    }
}