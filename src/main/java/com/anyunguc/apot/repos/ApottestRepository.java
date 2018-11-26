package com.anyunguc.apot.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.anyunguc.apot.entities.Apottest;

public interface ApottestRepository extends CrudRepository<Apottest, Long> {

	List<Apottest> findByName(String name);
}
