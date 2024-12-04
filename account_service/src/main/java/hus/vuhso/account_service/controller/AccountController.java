package hus.vuhso.account_service.controller;

import hus.vuhso.account_service.dto.AccountDTO;
import hus.vuhso.account_service.entity.Account;
import hus.vuhso.account_service.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts/")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    private final ModelMapper modelMapper;

    @GetMapping("get-list")
    public List<AccountDTO> getListAccounts() {
        List<Account> accounts = accountService.getListAccounts();

        List<AccountDTO> listAcDTO = modelMapper.map(
                accounts,
                new TypeToken<List<AccountDTO>>() {}.getType());
        return listAcDTO;
    }

    @PostMapping("create")
    public void createAccount(@RequestBody AccountDTO accountDTO) {
        Account account = modelMapper.map(accountDTO, Account.class);
        accountService.createAccount(account);
    }
}
