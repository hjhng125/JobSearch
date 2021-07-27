package com.jh.project.account;

import com.jh.project.exception.ErrorMessage;
import com.jh.project.exception.UserGuideException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    //TODO 계정 중복 체크
    @Transactional
    public Account join(Account account) {
        return accountRepository.save(account);
    }
}
