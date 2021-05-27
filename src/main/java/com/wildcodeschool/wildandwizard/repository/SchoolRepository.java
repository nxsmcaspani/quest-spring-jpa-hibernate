package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

    @Override
    List<School> findAll(Sort sort);

    @Override
    <S extends School> S save(S s);

    @Override
    void deleteById(Long aLong);

    @Override
    default Optional<School> findById(Long aLong) {
        return Optional.empty();
    }

}
