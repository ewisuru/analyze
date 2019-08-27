package com.zenika.analyze.repository;

import com.zenika.analyze.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {
}
