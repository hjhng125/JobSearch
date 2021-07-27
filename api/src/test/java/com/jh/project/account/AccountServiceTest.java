package com.jh.project.account;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AccountService.class)
class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @MockBean
    private AccountRepository accountRepository;

    @Test
    void account_repository_test() {
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }

    @Test
    void find_account_by_id_test() {
        Account account = accountService.findById(1L);
        System.out.println(account);
    }

    @Test
    void save_test() {
        // given
        Account account = Account.builder()
            .email("test@nate.com")
            .name("test")
            .password("test")
            .build();

        // when
        when(accountRepository.save(account)).thenReturn(account);
        Account join = accountService.join(account);

        // then
        assertThat(join.getEmail()).isEqualTo("test@nate.com");
        assertThat(join.getName()).isEqualTo("test");

    }
}