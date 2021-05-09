package com.jh.project.account;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> accounts() {
        return accountService.findAll();
    }

    @GetMapping("/accounts/{accountId}")
    public Account account(@PathVariable Long accountId) {
        return accountService.findById(accountId);
    }
}
