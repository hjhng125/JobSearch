package com.jh.project.account;

import com.jh.project.exception.ErrorMessage;
import com.jh.project.exception.UserGuideException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findById(Long accountId) {
        return accountRepository.findById(accountId)
            .orElseThrow(
                () ->
                    new UserGuideException(ErrorMessage.USER_NOT_FOUND));
    }
}
