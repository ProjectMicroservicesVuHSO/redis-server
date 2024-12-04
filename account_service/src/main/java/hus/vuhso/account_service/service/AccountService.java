package hus.vuhso.account_service.service;

import hus.vuhso.account_service.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getListAccounts();
    void createAccount(Account account);
}
