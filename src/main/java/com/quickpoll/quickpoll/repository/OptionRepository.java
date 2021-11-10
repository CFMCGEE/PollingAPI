package com.quickpoll.quickpoll.repository;

import com.quickpoll.quickpoll.domain.AOption;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<AOption, Long> {

}
