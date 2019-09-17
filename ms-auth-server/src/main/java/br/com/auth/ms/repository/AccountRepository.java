package br.com.auth.ms.repository;

import org.springframework.data.repository.Repository;

import br.com.auth.ms.entity.Account;

import java.util.Optional;

public interface AccountRepository extends Repository<Account, Long> {
    Optional<Account> findByUsername(String username);

    Account save(Account account);

}
