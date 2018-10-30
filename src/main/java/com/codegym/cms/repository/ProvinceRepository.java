package com.codegym.cms.repository;

import com.codegym.cms.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
