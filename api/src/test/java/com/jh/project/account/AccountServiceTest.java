package com.jh.project.account;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceTest {

    @Autowired
    private AccountService accountService;

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
}