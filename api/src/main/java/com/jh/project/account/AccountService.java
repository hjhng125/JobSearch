package com.jh.project.account;

import static com.jh.project.config.DataSourceConfig.TX_MANAGER;

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
    @Transactional(TX_MANAGER)
    public Account join(Account account) {
        return accountRepository.save(account);
    }
}
