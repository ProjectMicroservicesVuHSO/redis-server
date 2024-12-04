package hus.vuhso.account_service.service.impl;

import hus.vuhso.account_service.entity.Account;
import hus.vuhso.account_service.repository.AccountRepository;
import hus.vuhso.account_service.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public List<Account> getListAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }
}
